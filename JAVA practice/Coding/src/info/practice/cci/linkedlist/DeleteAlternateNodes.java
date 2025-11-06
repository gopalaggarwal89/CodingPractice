package info.practice.cci.linkedlist;

public class DeleteAlternateNodes {
	
	
	public static void main(String[] args) {
		
		int[] inputArray = { 2, 6, 1, 8, 9, 7, 4 };
		Node node = new Node();
		for (int i = 0; i < inputArray.length; i++) {
			node.addNode(inputArray[i]);
		}
		
		node.print(node.getHead());
		Node temp = node.getHead();
		
		while(temp != null) {
			
			if(temp.getNext()!=null && temp.getNext().getNext() != null) {				
				temp.setNext(temp.getNext().getNext());	
			}else {
				temp.setNext(null);
			}
			temp = temp.getNext();
		}
		
		System.out.println("AFTER");
		
		node.print(node.getHead());
	}

}
