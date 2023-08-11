package rentacar.com.rentACar.WebAPI.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import rentacar.com.rentACar.Business.Abstracts.IBrandService;
import rentacar.com.rentACar.Entities.Concretes.Brand;

@RestController		//annotation
@RequestMapping("/api/brands")
public class BrandsContoller {

	private IBrandService _brandService;

	@Autowired
	public BrandsContoller(IBrandService _brandService) {
		super();
		this._brandService = _brandService;
	}
	
	
	@GetMapping("/getAll")
	public List<Brand> GetAll()
	{
		return _brandService.GetAll();
	}
}
