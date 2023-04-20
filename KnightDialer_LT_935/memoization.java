package KnightDialer_LT_935;

import java.util.Scanner;

public class memoization {

    static int mod = 1000000007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = scanner.nextInt();
        int answer = knightDialer(n);
        System.out.println("No.of distinct phone numbers of length n is: "+answer);
    }

    public static int knightDialer(int n) {

        //no. of rows and columns of the dial pad
        int row = 4;
        int column = 3;
        long answer=0;
        long[][][]memoize = new long[row][column][n];

        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                answer=answer%mod+dfs(i,j,n-1,memoize)%mod;
            }
        }
        return (int)answer;
    }

    public static long dfs(int row, int column, int noOfJumps, long[][][]memoize){

        //checking for boundaries
        if(row<0 || row>=4 || column<0 || column>=3){
            return 0;
        }
        //checking for * and #
        if((column==0 && row==3) || (row==3 && column==2)){
            return 0;
        }
        if(noOfJumps==0){
            return 1;
        }

        if(memoize[row][column][noOfJumps]>0){
            return memoize[row][column][noOfJumps];
        }


        //all eight moves of the knight in a chess board

        memoize[row][column][noOfJumps] =   dfs(row-2,column-1,noOfJumps-1,memoize)%mod+
                dfs(row-2,column+1,noOfJumps-1,memoize)%mod+
                dfs(row-1,column+2,noOfJumps-1,memoize)%mod+
                dfs(row+1,column+2,noOfJumps-1,memoize)%mod+
                dfs(row+2,column-1,noOfJumps-1,memoize)%mod+
                dfs(row+2,column+1,noOfJumps-1,memoize)%mod+
                dfs(row-1,column-2,noOfJumps-1,memoize)%mod+
                dfs(row+1,column-2,noOfJumps-1,memoize)%mod;

        return memoize[row][column][noOfJumps];
    }
}
