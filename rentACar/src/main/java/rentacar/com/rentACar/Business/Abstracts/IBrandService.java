package rentacar.com.rentACar.Business.Abstracts;

import java.util.List;

import rentacar.com.rentACar.Business.Requests.CreateBrandRequest;
import rentacar.com.rentACar.Business.Responses.GetAllBrandResponse;

public interface IBrandService {

	List<GetAllBrandResponse> GetAll();
	
	void Add(CreateBrandRequest createBrandRequest);
}
