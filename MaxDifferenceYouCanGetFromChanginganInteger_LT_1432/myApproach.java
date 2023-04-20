package MaxDifferenceYouCanGetFromChanginganInteger_LT_1432;

public class myApproach {
    public static void main(String[] args) {
       int num = 555;
       int answer = maxDiff(num);
        System.out.println(answer);
    }

    public static int maxDiff(int num) {
       StringBuilder number = new StringBuilder(String.valueOf(num));
       int maxDifference=0;
       int a=0,b=0;
       for(int i=0;i<2;i++){
           int x1 = (int)(Math.random()*10);
           int y1 = (int)(Math.random()*10);
           System.out.println("x1 = "+x1+" y1 = "+y1);
           char x=(char)(x1+'0');
           char y =(char)(y1+'0');

           for(int j=0;j<number.length();j++){
               if(number.charAt(j)==x){
                    if(!(y==0 && j==0)){
                        number.replace(j,j+1,""+y);
                    }
               }
           }
           if(i==0){
                a = Integer.parseInt(new String(number));
           }
           else{
               b = Integer.parseInt(new String(number));
           }
       }
       return Math.abs(a-b);
    }

    public static boolean contains(StringBuilder sb, String findString){

        /*
         * if the substring is found, position of the match is
         * returned which is >=0, if not -1 is returned
         */
        return sb.indexOf(findString) > -1;
    }
}
