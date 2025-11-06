package leetcode.medium.tree;

import leetcode.util.TreeNode;

public class ValidateBST
{
    public static void main(String[] args)
    {
        // create an object of BinaryTree
        TreeNode bt = new TreeNode();
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);

        bt.preOrderTraverseTree(bt.root);

    }

}
