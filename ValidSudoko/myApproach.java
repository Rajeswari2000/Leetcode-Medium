package ValidSudoko;

import java.util.HashSet;

public class myApproach {
    public static void main(String[] args) {
        char[][] board = {{'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};


    }


    public static boolean isValidSudoku(char[][] board) {
        HashSet<String> hashSet = new HashSet<>();
        int m= board.length;
        int n=board[0].length;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]!='.'){

                }
            }
        }

      return true;
    }
}
