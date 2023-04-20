package ContainerWithMostWater_LT_11;

public class myApproach {
    public static void main(String[] args) {
      int height[]={2,3,4,5,18,17,6};
        System.out.println(maxArea(height));

    }
    public static int maxArea(int[] height) {
        int i=0,j=height.length-1,length,breadth,maxArea=0,currentArea;

        while(i<j){
            length = Math.min(height[i],height[j]);
            breadth = j-i;
            currentArea = length*breadth;
            maxArea = Math.max(currentArea,maxArea);

            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }


        }
        return maxArea;
    }
}
