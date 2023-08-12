package org.example.Graph;

import java.util.LinkedList;
import java.util.Queue;

public class FishWater {
    public static void main(String[] args) {
        FishWater fishWater = new FishWater();
        int[][] grid = new int[][]{{6,1,10}};
        int sum = fishWater.findMaxFish(grid);
        System.out.println(sum);
    }
    public int findMaxFish(int[][] grid) {
        // number se dfs in 4 dir, add, and maintain max;
        int m = grid.length;
        int n = grid[0].length;
        boolean [][] visited = new boolean[m][n];
        int mx = 0;
        int [] delRow = new int[]{-1,0,+1,0};
        int [] delCol = new int[]{0,+1,0,-1};
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] > 0 && visited[i][j] == false){
                    int sum = bfs(i,j,grid,visited,m,n,delRow,delCol);
                    mx = Math.max(mx, sum);
                }
            }
        }
        return mx;
    }

    int bfs(int row, int col, int[][] grid,boolean[][] visited, int m, int n, int [] delRow, int [] delCol){
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(row,col));
        visited[row][col] = true;
        int sum = 0;
        while(!q.isEmpty()){
            Pair cur = q.poll();
            int r = cur.first;
            int c = cur.second;
            sum += grid[r][c];

            //4 direction
            for(int i=0; i<4; i++){
                int nrow = r+delRow[i];
                int ncol = c+delCol[i];
                if(nrow>=0 && nrow<m && ncol>=0 && ncol<n
                        && grid[nrow][ncol] > 0 && visited[nrow][ncol]==false){
                    visited[nrow][ncol] = true;
                    q.add(new Pair(nrow, ncol));
                }
            }

        }
        return sum;
    }

}


class Pair{
    int first;
    int second;
    public Pair(int f, int s){
        this.first=f;
        this.second=s;
    }
}
