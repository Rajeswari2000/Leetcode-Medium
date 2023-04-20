package spiralmatrix;

public class myApproach {
    public static void main(String[] args) {
        int [][] matrix = new int[3][3];
         spiralOrder(matrix);

    }

    public static void spiralOrder(int [][]matrix){


        int left=0,top=0,right=matrix[0].length-1,bottom=matrix.length-1;
        int count=1;
        while(left<=right && top<=bottom){

            for(int j=left;j<=right;j++){
               matrix[top][j]=count++;
            }
             top++;

            for(int i=top;i<=bottom;i++){
                matrix[i][right]=count++;
            }
            right--;

            if(top<=bottom)
            for(int j=right;j>=left;j--){
               matrix[bottom][j]=count++;
            }
            bottom--;

            if(left<=right)
            for(int i=bottom;i>=top;i--){
               matrix[i][left]=count++;
            }
            left++;
        }


        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
