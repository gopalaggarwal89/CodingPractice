public class Address {
	
	public Address() {
		
	}
	
	public Address(City city) {
		this.city = city;
	}
	
	private City city;
	
	

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "city=" + city + "]";
	}
}
