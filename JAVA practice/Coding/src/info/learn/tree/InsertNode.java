package info.learn.tree;

public class InsertNode {

	public static void main(String[] args) {
		int[] dataArray = {5,3,6,7,2,9,1};
		Node node = null;
		for(int i=0;i<dataArray.length;i++) {			
			node = insertNode(node,dataArray[i]);
		}
	}

	private static Node insertNode(Node node,int data) {
		Node root;
		Node rootParent;
		root=node;
		rootParent=null;
		
		while(root!=null) {
			rootParent=root;
			if(data<root.data)
				root=root.leftNode;
			else
				root=root.rightNode;
		}
		
		Node newNode=new Node(data);
		if(rootParent==null) {
			root=newNode;
		}else if(data<rootParent.data) {
			rootParent.leftNode=newNode;
		}else
			rootParent.rightNode=newNode;
		
		return root;
	}
}

class Node{
	
	Node leftNode = null;
	Node rightNode = null;
	int data;
	
	public Node() {
		
	}
	
	public Node(int data){
		Node node = new Node();
		node.leftNode = null;
		node.rightNode = null;
		node.data = data;
	}
}
