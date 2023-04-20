package ZigzagConversion;

public class AlternateApproach {
    public static void main(String[] args) {
        String ans = convert("PAYPALISHIRING",3);
    }

    public static String convert(String s, int numRows) {
        int i = 0, x = 0, col = 0;
        String newStr = "";
        if(s.length() < 3 || numRows == 1)
            return s;
        col = (s.length() % 2 == 0) ? s.length() / 2 : s.length()/2 + 1;
        String arr[][] = new String[numRows][col];
        aa:
        for(int j=0;j<=col;j++){
            for(int k=0;k<numRows;k++){
                if((j % (numRows - 1) == 0) || ((k + j) % (numRows - 1) == 0)){
                    arr[k][j] = s.substring(x,x+1);
                    x++;
                    if(x == s.length())
                        break aa;
                }
                else
                    arr[k][j] = "";
            }
        }
        for(String[] ch : arr){
            for(String c : ch){
                if(c == null )
                    continue;
                newStr += c;
            }

        }
        return newStr;
    }
}

