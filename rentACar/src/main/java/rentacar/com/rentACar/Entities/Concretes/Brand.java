package rentacar.com.rentACar.Entities.Concretes;

public class Brand {

	private int Id;
	private String Name;
	
	
	public Brand() {
		super();
	}


	public Brand(int id, String name) {
		super();
		Id = id;
		Name = name;
	}


	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}
	
	
	
}
