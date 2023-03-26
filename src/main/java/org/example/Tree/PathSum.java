package org.example.Tree;

import org.example.random.TreeNode;

public class PathSum {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = null;
        root.right = new TreeNode(5);

        PathSum ps = new PathSum();
        System.out.println(ps.sumNumbers(root));
    }
    public int sumNumbers(TreeNode root) {

        Integer sum = 0;
        StringBuilder cur = new StringBuilder();
        int s = dfs(root, cur, sum);
        return s;
    }
    int dfs(TreeNode root, StringBuilder cur, Integer sum){
        if(root == null) return sum;
        cur.append(root.val);
        if(root.left == null && root.right == null){
            int curNum = Integer.parseInt(cur.toString());
            sum += curNum;
            return sum;
        }
        if(root.left != null) {
            sum = dfs(root.left, cur, sum);
            cur.deleteCharAt(cur.length() - 1);
        }
        if(root.right != null) {
            sum = dfs(root.right, cur, sum);
            cur.deleteCharAt(cur.length() - 1);
        }
        return sum;
    }
}
