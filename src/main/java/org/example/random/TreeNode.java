package org.example.random;

public class TreeNode {
     public int val;
     public TreeNode left;
     public TreeNode right;
     TreeNode() {}
     public TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }

class Solution {
    public static void main(String[] args) {
//        4,2,7,1,3,6,9
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(7);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        TreeNode result = invertTree(root);
    }
    public static TreeNode invertTree(TreeNode origroot) {
        TreeNode root = origroot;
        if(root == null) return null;
        if(root.left == null && root.right == null) return root;
        root.left = invertTree(root.left);
        root.right = invertTree(root.right);
        if(root.left!=null || root.right!=null){
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
        }
        return root;
    }
}
