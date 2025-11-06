public class Employee {

	public Employee() {

	}

	public Employee(Address address) {
		this.address = address;
	}

	private Address address;

	

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "address=" + address + "]";
	}
}
