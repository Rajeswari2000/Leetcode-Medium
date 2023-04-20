package BattleShipInABoard_LT_419;

public class myApproach {
    public static void main(String[] args) {
        char[][]board = {{'X','.','.','X'},{'.','.','.','X'},{'.','.','.','X'}};

        int answer = countBattleships(board);
        System.out.println(answer);
    }

    public static int countBattleships(char[][] board) {
        int count=0;
        for(int i=0; i<board.length; i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='X'){
                    count+= noOfBattleShips(i, j, board);
                }
            }
        }
        return count;
    }

    public static int noOfBattleShips(int i, int j, char[][]board){

        if(i>=board.length || j>=board[0].length || board[i][j]=='.') return 1;
        board[i][j]='.';


        noOfBattleShips(i+1,j,board);
        noOfBattleShips(i,j+1,board);
        return 1;

    }
}
