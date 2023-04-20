package SetMatrixZeroes_LT_73;

import java.util.ArrayList;

public class my_approach {
    public static void main(String[] args) {
        int[][]matrix = {{1,2,3},{2,0,4},{1,8,4}};
      setZeroes(matrix);
    }

    public static void setZeroes(int[][] matrix) {
        int i,j,k,l,move,row,coloumn;
        ArrayList<Integer> AL_row = new ArrayList<>();
        ArrayList <Integer> AL_coloumn = new ArrayList<>();

        for(i=0;i<matrix.length;i++){
            for(j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    if(!AL_row.contains(i)) AL_row.add(i);
                    if(!AL_coloumn.contains(j)) AL_coloumn.add(j);

                }
            }
        }

        for(i=0;i<matrix.length;i++){
            for(j=0;j<matrix[0].length;j++){
                if(AL_row.contains(i)){
                    for(l=0;l<matrix[0].length;l++){
                        matrix[i][j]=0;
                    }
                }
                if(AL_coloumn.contains(j)){
                    for(k=0;k<matrix[0].length;k++){
                        matrix[i][j]=0;
                    }

                }

            }
        }
        for(i=0;i< matrix.length;i++){
            for(j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }
}
