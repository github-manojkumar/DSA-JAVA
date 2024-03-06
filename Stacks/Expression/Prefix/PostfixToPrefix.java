package DSA_Java.Stacks.Expression.Prefix;

import java.util.Stack;

public class PostfixToPrefix {
    public static boolean isOperand(char ch){
        return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9');
    }

    public static String postfixToPrefix(String exp){
        Stack<String> stack=new Stack<>();
        int n=exp.length();
        for(int i=0;i<n;i++){
            char ch=exp.charAt(i);
            if(isOperand(ch)) stack.push(String.valueOf(ch));
            else{
                String op1=stack.pop();
                String op2=stack.pop();
                stack.push((ch+op2+op1));
            }
        }

        return stack.peek();
    }

    public static void main(String[] args) {
        String exp="abc/-ad/e-*";
//        String exp="(A+B)-C*(D/E)+F";
        System.out.println("Post Expression "+exp);
        System.out.println("Prefix Expression "+postfixToPrefix(exp));
    }
}
