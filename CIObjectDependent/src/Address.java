
public class Address {
	private String  city;
	private String  State;
	private String  Country;
	
	public Address(String city,String State, String Country) {
		super();
		this.city=city;
		this.State=State;
		this.Country=Country;
	}
	public String toString() {
		return city+" "+State+" "+Country;
	}
}
