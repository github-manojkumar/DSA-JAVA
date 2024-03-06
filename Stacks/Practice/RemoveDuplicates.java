package DSA_Java.Stacks.Practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class RemoveDuplicates {

    public static String result(Stack<Character> stack){
        StringBuilder result=new StringBuilder();
        for(char ch:stack){
            result.append(ch);
        }
        return result.toString();
    }

    public static String removeDuplicateLetters(String s) {
        if(s.length()<=1) return s;

        Stack<Character> stack=new Stack<>();
        HashSet<Character> seen=new HashSet<>();
        HashMap<Character,Integer> last_occ=new HashMap<>();

        for(int i=0;i<s.length();i++){
            last_occ.put(s.charAt(i),i);
        }

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!seen.contains(ch)){
                char peek=(!stack.isEmpty())?stack.peek():' ';
                while(!stack.isEmpty() && ch<peek && last_occ.get(peek)>i){
                    seen.remove(stack.pop());
                    peek=(!stack.isEmpty())?stack.peek():' ';
                }
                stack.push(ch);
                seen.add(ch);
            }
        }

        return result(stack);
    }

    public static void main(String[] args) {
        String str="bbcaac";
        System.out.println(removeDuplicateLetters(str));
    }
}
