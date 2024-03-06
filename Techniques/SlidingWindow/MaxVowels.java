package DSA_Java.Techniques.SlidingWindow;

public class MaxVowels {

    public static boolean isVowel(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
    public static int maxVowels(String s, int k) {

        int n=s.length();

        int i=0;
        int j=0;
        int maxVow=0;
        while(j<k){
            if(isVowel(s.charAt(j))){
                maxVow++;
            }
            j++;
        }
        int currCount=maxVow;
        i++;//j++ is already done from loop
        while(j<n){
            if(isVowel(s.charAt(i-1))){
                currCount--;
            }
            if(isVowel(s.charAt(j))){
                currCount++;
            }
            maxVow=Math.max(maxVow,currCount);
            i++;
            j++;
        }
        return maxVow;
    }

    public static void main(String[] args) {
        String s="abciiide";
        int k=3;
        System.out.println(maxVowels(s,k));
    }
}
