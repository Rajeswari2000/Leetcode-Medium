package Divide_two_integers;

public class myApproach {
    public static void main(String[] args) {
        int dividend = 10;
        int divisor = 3;
        int ans = divide(dividend,divisor);
        System.out.println(ans);
    }

    public static int divide(int dividend, int divisor) {
        int i,count_quotient=0;
        int originalDividend = dividend;
        int originalDivisor = divisor;



        if(originalDividend<0) dividend = dividend*(-1);
        if(originalDivisor<0) divisor = divisor*(-1);


        while(dividend>divisor){
            dividend = dividend - divisor;
            count_quotient++;
        }

        if(originalDividend<0 && originalDivisor<0){
            count_quotient = (1)*(count_quotient);
        }
        else if(originalDividend>0 && originalDivisor>0){
            count_quotient = (1)*(count_quotient);
        }
        else{
            count_quotient = (-1)*(count_quotient);
        }

        if(count_quotient>Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if(count_quotient<Integer.MIN_VALUE) return Integer.MIN_VALUE;

        return count_quotient;
    }


}
