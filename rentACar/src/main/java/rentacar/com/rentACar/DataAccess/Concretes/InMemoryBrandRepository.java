package rentacar.com.rentACar.DataAccess.Concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import rentacar.com.rentACar.DataAccess.Abstracts.IBrandRepository;
import rentacar.com.rentACar.Entities.Concretes.Brand;

@Repository
public class InMemoryBrandRepository implements IBrandRepository {

	List<Brand> brands;
	
	public InMemoryBrandRepository() {
		brands = new ArrayList<Brand>();
		brands.add(new Brand(1,"Volkswagen"));
		brands.add(new Brand(2,"Mercedes-Benz"));
		brands.add(new Brand(3,"Ford"));
		brands.add(new Brand(4,"Opel"));

		
	}
	
	
	@Override
	public List<Brand> GetAll() {
		
		return brands;
	}

}
