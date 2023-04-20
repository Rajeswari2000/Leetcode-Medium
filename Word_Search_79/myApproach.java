package Word_Search_79;

public class myApproach {

    public static void main(String[] args) {

        char[][] board = {{'A','B','C','E'},
                          {'S','F','C','S'},
                          {'A','D','E','E'}};
        String word = "SEE";

        boolean flag = exist(board, word);
        System.out.println(flag);
    }


    public static boolean exist(char[][] board, String word) {
        boolean flag;

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                    flag = dfs(word,board,i,j);
                    if(flag)return true;
                }
            }
        }
        return false;
    }


    public static boolean dfs(String str, char[][]board, int i, int j ){

        if(str.length()==0){
            return true;
        }

        if(i<0 || j<0 || i==board.length || j==board[0].length){
            return false;
        }

        if(str.charAt(0)==board[i][j]){
            char temp =  board[i][j];
            board[i][j] = '.';

            boolean flag = (dfs(str.substring(1),board,i-1,j)
                    ||dfs(str.substring(1),board,i+1,j)
                    ||dfs(str.substring(1),board,i,j-1)
                    ||dfs(str.substring(1),board,i,j+1));

            board[i][j] = temp;
            return flag;
        }
        return false;
    }
}
