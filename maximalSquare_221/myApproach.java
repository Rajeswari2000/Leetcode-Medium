package maximalSquare_221;

public class myApproach {
    public static void main(String[] args) {
        char [][] board= {{'1','0','1','0','0'},
                          {'1','0','1','1','1'},
                          {'1','1','1','1','1'},
                          {'1','0','0','1','0'}};

        int answer = maximalSquare(board);
        System.out.println(answer);
    }


    public static int maximalSquare(char[][] matrix) {
        int m= matrix.length;
        int n = matrix[0].length;
        int [][] board = new int [m][n];
        int maximum =0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                board[i][j]=matrix[i][j]-'0';
            }
        }

        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(board[i][j]!=0)
                board[i][j]=Math.min(Math.min(board[i-1][j],board[i][j-1]),board[i-1][j-1])+1;
            }
        }



        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                //System.out.print(board[i][j]);
                if(board[i][j]>maximum)maximum=board[i][j];
            }
//            System.out.println();
        }

       return (maximum*maximum);
    }

}
