package DSA_Java.Techniques.SlidingWindow;

import java.util.HashMap;

public class LongestSubstring {
    public static int kDistinctChars(int k, String str) {
        HashMap<Character,Integer> map=new HashMap<>();
        int count=0;
        int len=0;
        for(int i=0;i<k;i++){
            char ch=str.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }else{
                map.put(ch,1);
                count++;
            }
            len++;
        }

        int answer=len;
        int j=0;

        for(int i=k;i<str.length();i++){
            char ch=str.charAt(i);
            if(count<k || map.containsKey(ch)){
                if(!map.containsKey(ch)){
                    count++;
                }
                map.put(ch, map.getOrDefault(ch, 0)+1);
            }else{
                while(count>=k){
                    char rm=str.charAt(j);
                    if(map.get(rm)>1){
                        map.put(rm,map.get(rm)-1);
                    }else{
                        map.remove(rm);
                        count--;
                    }
                    j++;
                    len--;
                }
                map.put(ch,1);
                count++;
            }
            len++;
            answer=Math.max(answer,len);
        }
        return answer;

    }

    public static void main(String[] args) {
        String str="kqmrqiajzzpbrtncuqxrckmzdbxggv";
        int k=6;
        System.out.println(kDistinctChars(k,str));
    }

}
