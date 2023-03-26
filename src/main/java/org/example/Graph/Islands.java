package org.example.Graph;

public class Islands {
    public static void main(String[] args) {
//        char [][]grid = new char[][] {{'1','1','0','0','0'}
//                                    , {'1','1','0','0','0'}
//                                    , {'0','0','1','0','0'}
//                                    , {'0','0','0','1','1'}};
        char [][]grid = new char[][]{{'1','1','1'},
                                     {'0','1','0'},
                                     {'1','1','1'}  };
        System.out.println(numIslands(grid));
    }

    public static int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean [][] visited = new boolean[m][n];
        int count =0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] == '1' && visited[i][j] == false){
                    count++;
                    dfs(grid,i,j,visited,m,n);
                }
            }
        }
        return count;
    }

    public static void dfs(char [][]grid,int i,int j,boolean[][] visited,int m, int n){
        if(i==m || j==n || i<0 || j<0 || visited[i][j]) return;
        if(grid[i][j] == '1' && !visited[i][j]){
            visited[i][j] = true;

            dfs(grid,i+1,j,visited,m,n);
            dfs(grid,i,j+1,visited,m,n);
            dfs(grid,i-1,j,visited,m,n);
            dfs(grid,i,j-1,visited,m,n);

        }


    }
}
