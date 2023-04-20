package ClosestPrimeNumbersInRange_LT_2523;

import java.util.Arrays;

public class my_approach {
    public static void main(String[] args) {
        int left = 10, right=19;
        int [] ans = closestPrimes(left, right);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] closestPrimes(int left, int right) {
        //ArrayList<Integer> AL = new ArrayList<>();
        int[]arr1=new int[left+right];
        int i,difference=Integer.MAX_VALUE,curr_diff,j,count=0;
        int[]arr = new int[2];
        for(i=left;i<=right;i++){
            if(isPrime(i)){
                //AL.add(i);
                arr1[count++]=i;
            }
        }

        for(j=0;j<arr1.length-1;j++){
            //curr_diff = AL.get(j+1)-AL.get(j);
            curr_diff = arr1[j+1]-arr1[j];

            if(curr_diff<difference){
                //arr[0]=AL.get(j);arr[1]=AL.get(j+1);
                arr[0]=arr1[j];arr[1]=arr1[j+1];

            }
            difference = Math.min(difference,curr_diff);
        }
        if(arr[0]==0 && arr[1]==0){
            arr[0]=-1;
            arr[1]=-1;
            return arr;
        }
        return arr;

    }

    public static boolean isPrime(int n){
        int i;
        if(n<=1) return false;
        else if(n==2) return true;
        else if(n%2==0) return false;
        else{
            for(i=3;i<=Math.sqrt(n);i+=2){
                if(n%i==0){
                    return false;
                }
            }
        }
        return true;
    }

}

