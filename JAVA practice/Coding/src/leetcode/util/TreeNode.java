package leetcode.util;

public class TreeNode
{
    public TreeNode root;

    public int data;
    public TreeNode leftNode;
    public TreeNode rightNode;

    public TreeNode()
    {

    }

    public TreeNode(int data)
    {
        this.data = data;
        leftNode = rightNode = null;
    }

    private TreeNode addRecursive(TreeNode current, int value)
    {

        if (current == null) {
            return new TreeNode(value);
        }

        if (value < current.data) {
            current.leftNode = addRecursive(current.leftNode, value);
        }
        else if (value > current.data) {
            current.rightNode = addRecursive(current.rightNode, value);
        }
        else {
            return current;
        }

        return current;
    }

    public void add(int value)
    {
        root = addRecursive(root, value);
    }

    public void preOrderTraverseTree(TreeNode node)
    {
        if (node != null) {
            System.out.print(" " + node.data);
            preOrderTraverseTree(node.leftNode);
            preOrderTraverseTree(node.rightNode);
        }
    }
}
