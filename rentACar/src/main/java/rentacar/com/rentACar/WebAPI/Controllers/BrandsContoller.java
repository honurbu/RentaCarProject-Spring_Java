package rentacar.com.rentACar.WebAPI.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import rentacar.com.rentACar.Business.Abstracts.IBrandService;
import rentacar.com.rentACar.Business.Requests.CreateBrandRequest;
import rentacar.com.rentACar.Business.Requests.UpdateBranRequest;
import rentacar.com.rentACar.Business.Responses.GetAllBrandResponse;
import rentacar.com.rentACar.Business.Responses.GetByIdBrandResponse;

@RestController		//annotation
@AllArgsConstructor
@RequestMapping("/api/brands")
public class BrandsContoller {

	private IBrandService _brandService;

//	@Autowired		--> allargsconstructor dersek authowired e gerek kalmaz.
//	public BrandsContoller(IBrandService _brandService) {
//		super();
//		this._brandService = _brandService;
//	}
//	
	
	@GetMapping("/getAll")
	public List<GetAllBrandResponse> GetAll()
	{
		return _brandService.GetAll();
	}
	
	@GetMapping("/{id}")
	public GetByIdBrandResponse getById(@PathVariable int id)
	{
		return _brandService.GetById(id);
	}
	
	
	@PostMapping("/add")
	public void Add(@RequestBody() CreateBrandRequest createBrandRequest)	//-> RequestBody olmazsa null dönüyor
	{
		_brandService.Add(createBrandRequest);	
	}
	
	@PutMapping
	public void Update(@RequestBody() UpdateBranRequest updateBranRequest) 
	{
		_brandService.Update(updateBranRequest);
	}
	
	
	@DeleteMapping("/{id}")
	public void Delete(@PathVariable int id)		//PathVariable -> url de parametre olarak gelen sayıyı id al demek
	{
		_brandService.Delete(id);
	}
	
}
