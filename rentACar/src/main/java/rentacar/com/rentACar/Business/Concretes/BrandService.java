package rentacar.com.rentACar.Business.Concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rentacar.com.rentACar.Business.Abstracts.IBrandService;
import rentacar.com.rentACar.Business.Requests.CreateBrandRequest;
import rentacar.com.rentACar.Business.Responses.GetAllBrandResponse;
import rentacar.com.rentACar.DataAccess.Abstracts.IBrandRepository;
import rentacar.com.rentACar.Entities.Concretes.Brand;

@Service
public class BrandService implements IBrandService{

	private IBrandRepository _brandRepository;
	
	@Autowired
	public BrandService(IBrandRepository _brandRepository) {
		this._brandRepository = _brandRepository;
	}

	@Override
	public List<GetAllBrandResponse> GetAll() {
		List<Brand> brands = _brandRepository.findAll();
		List<GetAllBrandResponse> brandsResponse = new ArrayList<GetAllBrandResponse>();

		for (Brand brand : brands) {
			GetAllBrandResponse responseItem = new GetAllBrandResponse();
			responseItem.setId(brand.getId());
			responseItem.setName(brand.getName());
			brandsResponse.add(responseItem);
		}
		
		return brandsResponse;
		
	}

	@Override
	public void Add(CreateBrandRequest createBrandRequest) {
		Brand brand = new Brand();
		brand.setName(createBrandRequest.getName());
		
		_brandRepository.save(brand);
		
	}

	

}
