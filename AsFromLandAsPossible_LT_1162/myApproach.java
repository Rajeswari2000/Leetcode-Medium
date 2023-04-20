package AsFromLandAsPossible_LT_1162;

public class myApproach {
    public static void main(String[] args) {
        int [][]grid={{1,0,1},{0,0,0},{1,0,1}};
        int maximumDistance = 0;

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==0){
                    int distance = maxDistance(grid,i,j,0);
                    maximumDistance = Math.max(distance,maximumDistance);
                }
            }
        }
    }
    public static int maxDistance(int[][] grid,int i,int j,int distance) {
          if(i<0||j<0||i>= grid.length||j>=grid[0].length||grid[i][j]==1){
              return 0;
          }
        distance+=maxDistance(grid,i+1,j,1);

        distance+=maxDistance(grid,i-1,j,1);
        distance+=maxDistance(grid,i,j+1,1);
        distance+=maxDistance(grid,i,j-1,1);

        return distance;


    }
}
