package info.learn.design.pattern.adapter;

public class CustomerAdapter extends NewCustomer implements Customer{
	
	private OldCustomer oldCustomer;
	
	public CustomerAdapter(OldCustomer oldCustomer) {
		this.oldCustomer = oldCustomer;
		this.adaptData();
	}

	private void adaptData() {
		this.setName(oldCustomer.getName());
		this.setAge(Integer.valueOf(oldCustomer.getAge()));
		
		String[] oldAddress = oldCustomer.getAddress().split(",");
		Address address = new Address();
		address.setStreetName(oldAddress[0].trim());
		address.setPostalCode(Integer.valueOf(oldAddress[1].trim()));
		address.setCity(oldAddress[2].trim());
		
		this.setAddress(address);
	}
}
