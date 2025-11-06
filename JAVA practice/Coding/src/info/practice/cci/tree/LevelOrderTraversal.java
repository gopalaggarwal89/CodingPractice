package info.practice.cci.tree;

public class LevelOrderTraversal {

	Node root;

	int height(Node root) {
		if (root == null)
			return 0;
		else {
			/* compute height of each subtree */
			int lheight = height(root.left);
			int rheight = height(root.right);

			/* use the larger one */
			if (lheight > rheight)
				return (lheight + 1);
			else
				return (rheight + 1);
		}
	}

	void display() {
		int h = height(root);
		System.out.println(h);
	}

	public static void main(String args[]) {
		LevelOrderTraversal tree = new LevelOrderTraversal();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);

		tree.display();
		System.out.println("Level order traversal of binary tree is ");
	}

}

class Node {
	
	int nodeDistance;
	int data;
	Node left, right;

	public Node(int data) {
		this.data = data;
		left = right = null;

		this.nodeDistance = Integer.MAX_VALUE; 
	}

}
