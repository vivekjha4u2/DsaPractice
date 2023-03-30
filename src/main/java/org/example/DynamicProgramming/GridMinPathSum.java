package org.example.DynamicProgramming;

public class GridMinPathSum {
    public static void main(String[] args) {
        GridMinPathSum g = new GridMinPathSum();
        int[][] grid = new int[][]{{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(g.minPathSum(grid));

    }

    public int minPathSum(int[][] grid) {
        int m=grid.length-1;
        int n=grid[0].length-1;
        return helper(grid, 0, 0, m,n);
    }

    int helper(int[][] grid,int i,int j,int m,int n){
        if(i > m || j > n) return Integer.MAX_VALUE;

        if(i==m && j==n) return grid[m][n];

        int sum = grid[i][j] + Math.min(helper(grid, i+1, j, m,n), helper(grid, i, j+1, m,n));

        return sum;
    }
}
