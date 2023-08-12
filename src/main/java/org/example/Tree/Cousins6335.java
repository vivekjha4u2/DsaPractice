package org.example.Tree;

import com.sun.source.tree.Tree;
import org.example.random.TreeNode;

import java.util.*;

public class Cousins6335 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(9);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(10);
//        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        TreeNode ans = replaceValueInTree(root);
    }

    public static TreeNode replaceValueInTree(TreeNode root) {
        Map<TreeNode, TreeNode> childParent = new HashMap<>();
        TreeNode temp = root;
        makeChildMap(childParent, temp);


        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            List<TreeNode> list = new ArrayList<>();
            int sumOfLevel = 0;
            int count = q.size();
            for(int i=0; i<count; i++){
                TreeNode curr = q.poll();
                sumOfLevel += curr.val;
                list.add(curr);
                if(curr.left !=null) q.add(curr.left);
                if(curr.right !=null) q.add(curr.right);
            }

            //list me ek level k children h
            for(TreeNode node: list){
                TreeNode parent = childParent.get(node);
                int newVal = sumOfLevel - node.val;
                if(parent == null){
                    node.val = 0;
                }
                else if(parent.left == node){
                    if(parent.right !=null)
                        node.val = newVal - parent.right.val;
                    else node.val =0;
                }else if(parent.right == node){
                    if(parent.left !=null)
                        node.val = newVal - parent.left.val;
                    else node.val =0;
                }
            }

        }
        return root;


    }

    public static void makeChildMap(Map<TreeNode, TreeNode> childParent, TreeNode temp){
        if(temp == null) return;
        if(temp.left == null && temp.right == null )return;
        makeChildMap(childParent, temp.left);
        if(temp.left != null) {
            childParent.put(temp.left, temp);
        }
        if(temp.right != null) {
            childParent.put(temp.right, temp);
        }
        makeChildMap(childParent, temp.right);

    }
}
