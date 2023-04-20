package NumberOfIslands_LT_200;

public class myApproach {
    public static void main(String[] args) {
      char [][] grid={{'1','1','0','0','0'},{'1','1','0','0','0'},{'0','0','1','0','0'},{'0','0','0','1','1'}};
      int countOfIslands = numIslands(grid);
        System.out.println(countOfIslands);
    }
    public static int numIslands(char[][] grid) {
       int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    count++;

                    dfs(grid,i,j);
                }
            }
        }
        return count;
    }

    public static void dfs(char[][]grid,int i,int j){

        if(i<0 || i>= grid.length || j<0 ||j>=grid[0].length ||grid[i][j]=='2' ||grid[i][j]=='0'){
            return;
        }
         if(grid[i][j]=='1'){
             grid[i][j]='2';
         }

        dfs(grid,i-1,j);
        dfs(grid,i+1,j);
        dfs(grid,i,j-1);
        dfs(grid,i,j+1);

    }
}
