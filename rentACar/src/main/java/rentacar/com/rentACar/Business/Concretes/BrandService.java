package rentacar.com.rentACar.Business.Concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rentacar.com.rentACar.Business.Abstracts.IBrandService;
import rentacar.com.rentACar.DataAccess.Abstracts.IBrandRepository;
import rentacar.com.rentACar.Entities.Concretes.Brand;

@Service
public class BrandService implements IBrandService{

	private IBrandRepository _brandRepository;
	
	
	@Autowired
	public BrandService(IBrandRepository _brandRepository) {
		super();
		this._brandRepository = _brandRepository;
	}



	@Override
	public List<Brand> GetAll() {
		var values = _brandRepository.GetAll();
		return values;
	}

}
