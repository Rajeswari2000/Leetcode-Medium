package BrickWall_LT_554;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class myApproach {
    public static void main(String[] args) {
        List<List<Integer>> wall = new ArrayList<>();
        wall.add(new ArrayList<>(Arrays.asList(1,2,2,1)));
        wall.add(new ArrayList<>(Arrays.asList(3,1,2)));
        wall.add(new ArrayList<>(Arrays.asList(1,3,2)));
        wall.add(new ArrayList<>(Arrays.asList(2,4)));
        wall.add(new ArrayList<>(Arrays.asList(3,1,2)));
        wall.add(new ArrayList<>(Arrays.asList(1,3,1,1)));

        int answer = leastBricks(wall);
    }


    public static int leastBricks(List<List<Integer>> wall) {

        int n = 0;
        int count = 0;
        int current;

        List<Integer> nSum = new ArrayList<>(wall.get(0));
        List<List<Integer>> listOfList =  new ArrayList<>();


        for(int i =0; i<nSum.size(); i++){
            n+=nSum.get(i);
        }

        int[][] mat = new int [n][n];
        int l=0,g=0;
        for(int j=0;j<n;j++){
            List<Integer> eachList = new ArrayList<>(wall.get(j));
             g=0;
             current=0;
            for(int k=0;k<eachList.size();k++){
                current = current==0? 1:0;
                count = eachList.get(k);
                while(l<count){
                    mat[j][g++]=current;
                    l++;
                }
                l=0;
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }

        return 1;
    }
}


