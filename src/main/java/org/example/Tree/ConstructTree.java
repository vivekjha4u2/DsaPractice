package org.example.Tree;

import org.example.random.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class ConstructTree {
    public static void main(String[] args) {
        int [] preorder = new int []{3,9,20,15,7};
        int [] inorder = new int[] {9,3,15,20,7};
        TreeNode res = buildTree(preorder, inorder);
    }

    public static TreeNode buildTree(int[] preorder, int[] inorder) {

        Map<Integer,Integer> inmap = new HashMap<>();
        for(int i=0; i<inorder.length; i++){
            inmap.put(inorder[i],i);
        }
        return helper(preorder,0,preorder.length-1,inorder,0,inorder.length-1, inmap);
    }
    public static TreeNode helper(int[]pre, int preStart, int preEnd, int[]inord, int inStart, int inEnd, Map<Integer, Integer> inmap){
        if(preStart>preEnd || inStart>inEnd) return null;

        TreeNode root = new TreeNode(pre[preStart]);
        int inRoot = inmap.get(pre[preStart]);
        int numsLeft= inRoot-inStart;

        root.left = helper(pre, preStart+1, preStart+numsLeft, inord, inStart, inRoot-1, inmap);
        root.right = helper(pre, preStart+numsLeft+1, preEnd, inord, inRoot+1, inEnd, inmap);

        return root;
    }
}
