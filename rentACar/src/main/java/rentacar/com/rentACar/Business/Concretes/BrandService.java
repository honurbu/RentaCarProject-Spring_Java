package rentacar.com.rentACar.Business.Concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import rentacar.com.rentACar.Business.Abstracts.IBrandService;
import rentacar.com.rentACar.Business.Requests.CreateBrandRequest;
import rentacar.com.rentACar.Business.Requests.UpdateBranRequest;
import rentacar.com.rentACar.Business.Responses.GetAllBrandResponse;
import rentacar.com.rentACar.Business.Responses.GetByIdBrandResponse;
import rentacar.com.rentACar.Core.Utilities.Mappers.IModelMapperService;
import rentacar.com.rentACar.DataAccess.Abstracts.IBrandRepository;
import rentacar.com.rentACar.Entities.Concretes.Brand;

@Service		//burası businness dir
@AllArgsConstructor
public class BrandService implements IBrandService{

	private IBrandRepository _brandRepository;
	private IModelMapperService _modelMapperService;

	@Override
	public List<GetAllBrandResponse> GetAll() {
		List<Brand> brands = _brandRepository.findAll();
//		List<GetAllBrandResponse> brandsResponse = new ArrayList<GetAllBrandResponse>();
//
//		for (Brand brand : brands) {
//			GetAllBrandResponse responseItem = new GetAllBrandResponse();
//			responseItem.setId(brand.getId());
//			responseItem.setName(brand.getName());
//			brandsResponse.add(responseItem);
//		}
		
		List<GetAllBrandResponse> brandsResponse = brands.stream()
		.map(brand->this._modelMapperService.forReponse()
				.map(brand, GetAllBrandResponse.class)).collect(Collectors.toList());
		
				
		return brandsResponse;
		
	}

	@Override
	public void Add(CreateBrandRequest createBrandRequest) {
		Brand brand = this._modelMapperService.forRequest().map(createBrandRequest, Brand.class);
		
		this._brandRepository.save(brand);
		
	}

	@Override
	public GetByIdBrandResponse GetById(int id) {
		Brand brand = _brandRepository.findById(id).orElseThrow();
		
		GetByIdBrandResponse response = _modelMapperService.forReponse().map(brand, GetByIdBrandResponse.class);		
		return response;
	}

	@Override
	public void Update(UpdateBranRequest updateBranRequest) {

		Brand brand = this._modelMapperService.forRequest().map(updateBranRequest, Brand.class);
		_brandRepository.save(brand);
		
	}

	@Override
	public void Delete(int id) {
		_brandRepository.deleteById(id);
		
	}

	

}
