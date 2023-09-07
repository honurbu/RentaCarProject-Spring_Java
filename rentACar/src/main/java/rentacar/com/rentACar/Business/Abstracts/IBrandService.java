package rentacar.com.rentACar.Business.Abstracts;

import java.util.List;

import rentacar.com.rentACar.Business.Requests.CreateBrandRequest;
import rentacar.com.rentACar.Business.Requests.UpdateBranRequest;
import rentacar.com.rentACar.Business.Responses.GetAllBrandResponse;
import rentacar.com.rentACar.Business.Responses.GetByIdBrandResponse;

public interface IBrandService {

	List<GetAllBrandResponse> GetAll();
	GetByIdBrandResponse GetById(int id);
	void Add(CreateBrandRequest createBrandRequest);
	void Update(UpdateBranRequest updateBranRequest);
	void Delete(int id);
	
}
