package rentacar.com.rentACar.Entities.Concretes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Id;

//ctl + shift + o --> kullanılmayan kütüphaneleri siler

@Table(name="Brands")
@Data  //@Getter + @Setter birleşimi
@AllArgsConstructor
@NoArgsConstructor
@Entity 		//veri tabanı varlığısın demek.
public class Brand {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY) 		//--> Identity Spesification (Id nin 1 1 artması)
	@Column(name="Id")
	private int Id;
	
	@Column(name="Name")
	private String Name;	
}
