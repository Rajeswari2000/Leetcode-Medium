package KnightDialer_LT_935;

import java.util.Scanner;



 public class myApproach {

    static int mod = 1000000007;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = scanner.nextInt();
        int answer = knightDialer(n);
        System.out.println("No.of distinct phone numbers of length n is: "+answer);
    }

    public static int knightDialer( int n) {

        //no. of rows and columns of the dial pad
        int row = 4;
        int column = 3;
        long answer=0;

        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                answer=answer%mod+dfs(i,j,n-1)%mod;
            }
        }
       return (int)answer;
    }

    public static long dfs( int row, int column, int noOfJumps){

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


        //all eight moves of the knight in a chess board

        return  dfs(row-2,column-1,noOfJumps-1)%mod+
                dfs(row-2,column+1,noOfJumps-1)%mod+
                dfs(row-1,column+2,noOfJumps-1)%mod+
                dfs(row+1,column+2,noOfJumps-1)%mod+
                dfs(row+2,column-1,noOfJumps-1)%mod+
                dfs(row+2,column+1,noOfJumps-1)%mod+
                dfs(row-1,column-2,noOfJumps-1)%mod+
                dfs(row+1,column-2,noOfJumps-1)%mod;

    }

     public static void test1(){

     }
}

//class Test extends myApproach{
//
//
//    public static void test1(){
//        myApproach my = new myApproach();
//        my.test1();
//       super.test1();
//    }
//
//}
