package KokoEatingBananas_LT_875;

public class myApproach {

    public static void main(String[] args) {
        int h=8;
        int[] piles = {3,6,7,11};
    }

    public static int minEatingSpeed(int[] piles, int h) {


        int max = piles[0];
        int min;
        int sum=0;

        for(int i=0;i<piles.length;i++){
            if(piles[i]>max) max=piles[i];
            sum+=piles[i];
        }
        int hour=0;
        int mid=0;
        min = sum/h;
       while(min<max) {
         mid = (min+max)/2;
           for (int i = 0; i < piles.length; i++) {
               int current = piles[i];
               while (current > 0) {
                   current = current - mid;
                   hour++;
               }
           }
           if(hour>h){
               min=mid;
           }
           else{
               max=mid;
           }
       }

       return mid;
    }
}
