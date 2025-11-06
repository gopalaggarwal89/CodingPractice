package info.practice.cci.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class DetectLoop {

	public static void main(String[] args) {

		//Join 4 to 8
		int[] inputArray = { 2, 6, 1, 8, 9, 7, 4 };
		Node node = new Node();
		for (int i = 0; i < inputArray.length; i++) {
			node.addNode(inputArray[i]);
		}
		Node temp = node.getHead();
		while (temp.getNext() != null) {
			temp = temp.getNext();
		}

		// Creating loop
		Node join = node.getHead().getNext().getNext().getNext();
		temp.setNext(join);
		System.out.println("Join " + join);
		Node temp1 = detectLoop(node.getHead());
		
		System.out.println(temp1);
	}

	static Node detectLoop(Node node) {
		Node slow = node, fast = node;
		System.out.println("slow : fast");
		while (slow != null && fast != null && fast.getNext() != null) {

			slow = slow.getNext();
			fast = fast.getNext().getNext();
			
			System.out.println(slow + " : "+fast);
			// If slow and fast meet at same point then loop is present
			if (slow == fast)
				break;
		}
		
		if (slow == fast) {
            slow = node;
            while (slow.getNext() != fast.getNext()) {
                slow = slow.getNext();
                fast = fast.getNext();
            }
 
            /* since fast->next is the looping point */
            fast.setNext(null);/* remove loop */
        }
		return slow;
	}
}
