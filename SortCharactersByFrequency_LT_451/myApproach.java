package SortCharactersByFrequency_LT_451;

public class myApproach {
    public static void main(String[] args) {
        String s = "Aabb";
        String answer = frequencySort(s);
        System.out.println(answer);
    }
    public static String frequencySort(String s) {
        String ans="";
        int[] frequency = new int[256];
        char[] alphabet = new char[s.length()];
        int[] count = new int [s.length()];
        int j=0,k=0;

        for(int i=0;i<s.length();i++){
            //char ch = s.charAt(i);
            frequency[s.charAt(i)]++;
        }

        for(int i=0; i<frequency.length; i++){
            if(frequency[i]==0)continue;
            alphabet[j++]=(char)i;
            count[k++]=frequency[i];
        }

        //System.out.println(Arrays.toString(alphabet));
        //System.out.println(Arrays.toString(count));

        for(int i=0;i<count.length;i++){
            for( j=i+1;j<count.length;j++){
                if(count[i]<count[j]){
                    int temp=count[i];
                    count[i]=count[j];
                    count[j]=temp;

                    char temp1 = alphabet[i];
                    alphabet[i]= alphabet[j];
                    alphabet[j] = temp1;
                }

            }
            String s1  = ""+alphabet[i];
            ans+=s1.repeat(count[i]);
        }

        //System.out.println(Arrays.toString(alphabet));
        //System.out.println(Arrays.toString(count));

        // for(int i=0;i<k;i++){



        // }
        //System.out.println(ans);



        return ans;
    }
}
