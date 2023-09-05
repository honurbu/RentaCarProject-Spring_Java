package rentacar.com.rentACar.Business.Responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllBrandResponse {

	private int Id;
	private String Name;
}
