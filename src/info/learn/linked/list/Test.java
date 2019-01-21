package info.learn.linked.list;

public class Test {
	
	
	public static void main(String[] args) {
		
		LinkedList<User> userLinkedList = new LinkedList<User>();
		userLinkedList.addNode(new User("Gopal",28,"gopal.k.aggarwal@oracle.com"));
		userLinkedList.addNode(new User("Rohit",28,"rohit.hinduja@oracle.com"));
		userLinkedList.addNode(new User("Charan",24,"charanjit.ghai@oracle.com"));
		
		userLinkedList.print();
		
		userLinkedList.deleteNode(new User("Rohit",28,"rohit.hinduja@oracle.com"));
		
		System.out.println("After delete");
		
		userLinkedList.print();
		
		userLinkedList.reserve();
		
		System.out.println("After reverse");
		userLinkedList.print();
		
		userLinkedList.reserveWithRecursion(null, null);
		System.out.println("After reverse with recursion");
		userLinkedList.print();
	}

}
