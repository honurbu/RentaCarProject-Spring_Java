package rentacar.com.rentACar.WebAPI.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import rentacar.com.rentACar.Business.Abstracts.IBrandService;
import rentacar.com.rentACar.Business.Requests.CreateBrandRequest;
import rentacar.com.rentACar.Business.Responses.GetAllBrandResponse;

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
	public List<GetAllBrandResponse> GetAll()
	{
		return _brandService.GetAll();
	}
	
	@PostMapping("/add")
	public void Add(@RequestBody() CreateBrandRequest createBrandRequest)	//-> RequestBody olmazsa null dönüyor
	{
		_brandService.Add(createBrandRequest);	
	}
}
