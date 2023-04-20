package LT_1343_NumberOfSubArraysofSizeKAndAverageGreaterThanorEqualToThreshold;

public class MyApproach {
    public static void main(String[] args) {
        int[] arr = {2,2,2,2,5,5,5,8};
        int k=3;
        int threshold = 4;
        int ans = numOfSubarrays(arr,k,threshold);
    }
    public static int numOfSubarrays(int[] arr, int k, int threshold) {
        int count=0;
        int i=0,j=k-1;
        int sum=0;
        int average=0;

        for(i=0;i<k;i++){
            sum+=arr[i];
        }
        average = sum/k;
        if(average>=4) count++;

        for(i=0;i<arr.length-k;i++){

            sum = sum-arr[i]+arr[i+k-1];
            average = sum/k;
            if(average>=4) count++;
        }

        return count;
    }
}
