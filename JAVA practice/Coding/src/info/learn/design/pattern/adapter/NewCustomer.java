package info.learn.design.pattern.adapter;

public class NewCustomer implements Customer{
	
	private String name;
	private int age;
	private Address address;	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public int getAge() {
		return age;
	}
	
	@Override
	public Address getAddress() {
		return address;
	}
}
