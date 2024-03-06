package DSA_Java.HashMaps.Practice;

public class MaximumFreqCharacter {
    public static char maxFreq(String str){
        int[] freq=new int[26];
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
           freq[ch-'a']++;
        }

        char ans=' ';
        int max=0;
        for(int i=0;i<freq.length;i++){
            if(freq[i]>0 && max<freq[i]){
               ans=(char)('a'+i);
               max=freq[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String str="bacdeaaba";
        System.out.println(maxFreq(str));
    }
}
