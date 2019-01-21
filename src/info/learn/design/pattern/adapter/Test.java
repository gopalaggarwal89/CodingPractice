package info.learn.design.pattern.adapter;

public class Test {

	public static void main(String[] args) {
		
		OldCustomer oldCustomer = new OldCustomer();
		oldCustomer.setName("Gapal");
		oldCustomer.setAge("28");
		oldCustomer.setAddress("Clement town, 248002, Dehradun");
	
		Customer customer = new CustomerAdapter(oldCustomer);
		System.out.println(customer.getName());
		System.out.println(customer.getAge());
		System.out.println(customer.getAddress().getStreetName());
		System.out.println(customer.getAddress().getPostalCode());
		System.out.println(customer.getAddress().getCity());
	}
	
}
