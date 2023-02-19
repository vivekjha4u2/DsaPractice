package org.example.Tree;

import org.example.random.TreeNode;

import java.util.*;

public class ZigzagTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        List<List<Integer>> result =  zigzagLevelOrder(root);
    }
    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        if(root ==null) return result;
        queue.add(root);
        boolean reverse = false;
        while(queue.isEmpty()==false){
            List<Integer> iList = new ArrayList<Integer>();
            int count = queue.size();
            for(int i=0;i<count;i++){
                TreeNode curr = queue.poll();
                iList.add(curr.val);
                if(curr.left != null) queue.add(curr.left);
                if(curr.right != null) queue.add(curr.right);
            }

            if(reverse) Collections.reverse(iList);
            reverse = !reverse;
            result.add(iList);

        }
        return result;
    }
}
