package UniquePaths2;

public class UniquePaths2 {
    public static void main(String[] args) {
        int [][] obstacleGrid ={{0,0},{1,1},{0,0}};
        int answer = uniquePathsWithObstacles(obstacleGrid);
    }

    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int row = obstacleGrid.length;
        int coloumn = obstacleGrid[0].length;
        int[][] grid = new int [row][coloumn];

        if(obstacleGrid[0][0]==1) return 0;
        if(row==1){
            for(int i=0;i<row;i++){
                if(obstacleGrid[0][i]==1) return 0;
            }
        }

        if(coloumn==1){
            for(int i=0;i<coloumn;i++){
                if(obstacleGrid[i][0]==1) return 0;
            }
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<coloumn;j++){
                if(i==0 && obstacleGrid[i][j]==1){
                    for(int k=j; k<obstacleGrid[0].length;k++){
                        grid[0][k]=-1;
                    }
                    break;
                }
                else if(i==0 && obstacleGrid[i][j]==0){
                    grid[0][j]=1;
                }
                else if(j==0 && obstacleGrid[i][j]==1){
                    for(int k=i; k<obstacleGrid.length;k++) {
                        grid[k][0] = -1;
                    }
                }
                else if(j==0 && obstacleGrid[i][j]==0){
                    grid[i][0]=1;
                }
                else if(obstacleGrid[i][j]==1){
                    grid[i][j]=-1;
                }
            }
        }

        for(int i= 0; i<row;i++){
            for(int j=0;j<coloumn;j++){
                System.out.print(obstacleGrid[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();

        for(int i= 0; i<row;i++){
            for(int j=0;j<coloumn;j++){
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<coloumn;j++){
                if(i!=0 && j!=0 && grid[i][j]!=-1){
                    if(grid[i-1][j]==-1 && grid[i][j-1]==-1){
                        grid[i][j]=0;
                    }
                    else if(grid[i-1][j]==-1 && grid[i][j-1]!=-1){
                        grid[i][j]=grid[i][j-1];
                    }
                    else if(grid[i-1][j]!=-1 && grid[i][j-1]==-1){
                        grid[i][j]=grid[i-1][j];
                    }
                    else{
                        grid[i][j]=grid[i-1][j]+grid[i][j-1];
                    }

                }
            }
        }

        System.out.println();
        for(int i= 0; i<row;i++){
            for(int j=0;j<coloumn;j++){
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }

        if ( grid[row-1][coloumn-1]==-1) return 0;
        return grid[row-1][coloumn-1];
    }

}
