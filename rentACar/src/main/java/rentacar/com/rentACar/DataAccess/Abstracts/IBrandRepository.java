package rentacar.com.rentACar.DataAccess.Abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import rentacar.com.rentACar.Entities.Concretes.Brand;

public interface IBrandRepository extends JpaRepository<Brand,Integer> {

}
