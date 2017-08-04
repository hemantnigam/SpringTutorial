import java.util.Iterator;
import java.util.List;

public class Employee {
	private int id;
	private String name;
	private List<Address> address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}
	
	public void show() {
		System.out.println(id+" "+name);
		Iterator<Address> itr=address.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
}
