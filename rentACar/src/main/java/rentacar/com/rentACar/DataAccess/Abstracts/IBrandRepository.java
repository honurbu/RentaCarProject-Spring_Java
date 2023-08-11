package rentacar.com.rentACar.DataAccess.Abstracts;

import java.util.List;

import rentacar.com.rentACar.Entities.Concretes.Brand;

public interface IBrandRepository {

	List<Brand> GetAll();
}
