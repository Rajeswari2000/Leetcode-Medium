package ZigzagConversion;

public class my_approach {
    public static void main(String[] args) {
        String s = convert("PAYPALISHIRING", 3);
        System.out.println(s);

    }
    public static String convert(String s, int numRows) {
        if(numRows==1)return s;
        if(s.length()==2 && numRows==1)return s;
        if(s.length()==2 && numRows==2) return s;
        int i=0,k,j=0,n=s.length()/2+1,c,index=0;String ans="";
        char [][] mat = new char[numRows][s.length()/2+1];


        while(j<s.length()){
            if(index>=s.length()) break;
            for(k=0;k<mat.length;k++){
                if(index>=s.length()) break;
                mat[k][j]=s.charAt(index++);
            }
            k--;

            for(int h =0; h<numRows-2; h++){
                if(index>=s.length()) break;
                mat[k-1][j+1] = s.charAt(index++);
                j++;k--;
            }
            j++;
            if(index>=s.length()) break;

        }

        for(i=0;i<numRows;i++){
            for(j=0;j<s.length()/2+1;j++){
                // System.out.print(mat[i][j]+" ");

                if(mat[i][j]!='\u0000'){
                    ans+=mat[i][j];
                }
            }
            System.out.println();
        }


        return ans;
    }
}
