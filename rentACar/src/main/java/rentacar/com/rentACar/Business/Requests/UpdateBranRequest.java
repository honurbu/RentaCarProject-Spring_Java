package rentacar.com.rentACar.Business.Requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class UpdateBranRequest {
	public int Id;
	public String Name;
}
