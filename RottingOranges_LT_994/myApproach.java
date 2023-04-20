package RottingOranges_LT_994;

import java.util.LinkedList;
import java.util.Queue;

public class myApproach {

    public static void main(String[] args) {
        int [][] grid = {{2,1,1},{1,1,0},{0,1,1}};

        int answer = orangesRotting(grid);
        System.out.println(answer);
    }

    public static int orangesRotting(int[][] grid) {

        int level=0;
        Queue<int[]> queue = new LinkedList<>();
        int[][]direction = {{1,0},{-1,0},{0,1},{0,-1}};
        int countFresh=0;


        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2){
                    queue.offer(new int[]{i, j});
                }
                else if(grid[i][j]==1){
                    countFresh++;
                }
            }
        }


        while(!queue.isEmpty()){
            int currentParents = queue.size();
            for (int i = 0; i<currentParents; i++) {
                int[]array = queue.poll();

                for(int j=0;j<4;j++){
                   int x = direction[j][0]+array[0];
                   int y = direction[j][1]+array[1];

                   if(x<0 || y<0 || x>= grid.length || y>=grid[0].length)continue;
                   if(grid[x][y]==1){
                       queue.offer(new int[]{x,y});
                       countFresh--;
                       grid[x][y]=2;
                   }


                }
            }
            level++;
        }

        return countFresh==0? level-1:-1;
    }
}
