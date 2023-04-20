public class MaxAreaOfIsland_LT_695 {
    public static void main(String[] args) {
        int[][]grid ={{0,0,1,0,0,0,0,1,0,0,0,0,0},
                     {0,0,0,0,0,0,0,1,1,1,0,0,0},
                     {0,1,1,0,1,0,0,0,0,0,0,0,0},
                     {0,1,0,0,1,1,0,0,1,0,1,0,0},
                     {0,1,0,0,1,1,0,0,1,1,1,0,0},
                     {0,0,0,0,0,0,0,0,0,0,1,0,0},
                     {0,0,0,0,0,0,0,1,1,1,0,0,0},
                     {0,0,0,0,0,0,0,1,1,0,0,0,0}};

        int answer = maxAreaOfIsland(grid);
        System.out.println(answer);

    }
    public static int maxAreaOfIsland(int[][] grid) {
        int maximumArea = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    int area=findMaximumArea(grid,i,j,1);
                    maximumArea=Math.max(area,maximumArea);
                }
            }
        }
        return maximumArea;
    }

    public static int findMaximumArea(int[][]grid,int i,int j,int area){

        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]!=1){
            return 0;
        }

        grid[i][j]=0;

        area+=findMaximumArea(grid,i+1,j,1);
        area+=findMaximumArea(grid,i-1,j,1);
        area+=findMaximumArea(grid,i,j+1,1);
        area+=findMaximumArea(grid,i,j-1,1);

        return area;
        //return 1+findMaximumArea(grid,i+1,j,area)+findMaximumArea(grid,i-1,j,area)+findMaximumArea(grid,i,j+1,area)+findMaximumArea(grid,i+1,j-1,area);

    }


//    public static int maxAreaOfIsland(int[][] grid) {
//
//        int maxArea = 0;
//        for (int r=0; r<grid.length; r++){
//            for (int c=0; c<grid[0].length; c++){
//                if (grid[r][c] == 1){
//                    int area = expand(grid, r, c, 1);
//                    maxArea = java.lang.Math.max(area, maxArea);
//                }
//            }
//        }
//        return maxArea;
//    }
//
//    private static int expand(int[][] grid, int r, int c, int area){
//
//        if (r<0 || c<0 || r>=grid.length || c>=grid[0].length || grid[r][c]!=1)
//            return 0;
//
//        grid[r][c] = 0;
//        area += expand(grid, r+1, c, 1);
//        area += expand(grid, r-1, c, 1);
//        area += expand(grid, r, c+1, 1);
//        area += expand(grid, r, c-1, 1);
//        return area;
//    }
}
