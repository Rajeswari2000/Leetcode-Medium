package SurroundedRegions_LT_130;

public class myApproach {
    public static void main(String[] args) {
//      char [][] board = {{'X','X','X','X'},
//                         {'X','O','O','X'},
//                         {'X','X','O','X'},
//                         {'X','O','X','X'}};

        char [][] board ={{'O','O'},{'O','O'}};


        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='O' && ((i==0)||(j==0)||(i==board.length-1)||(j==board[0].length-1))){
                    solve(board,i,j);
                }
            }
        }

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='O')board[i][j]='X';
                if(board[i][j]=='S')board[i][j]='0';
            }
        }
    }

    public static void solve(char[][] board,int i,int j) {
        if(i<0||j<0||i>=board.length||j>=board[0].length|| board[i][j]=='X' || board[i][j]=='S'){
          return;
        }
        if(board[i][j]=='O')board[i][j]='S';

        solve(board,i+1,j);
        solve(board,i-1,j);
        solve(board,i,j+1);
        solve(board,i,j-1);
    }
}
