package DSA_Java.Stacks.Expression.Postfix;

import java.util.Stack;

public class PrefixToPostfix {

    public static boolean isOperand(char ch){
        return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9');
    }

    public static String prefixToPostfix(String exp){

        Stack<String> stack=new Stack<>();
        int n=exp.length();
        for(int i=n-1;i>=0;i--){
            char ch=exp.charAt(i);
            if(isOperand(ch)) stack.push(String.valueOf(ch));
            else{
                String op1=stack.pop();
                String op2=stack.pop();
                stack.push((op1+op2+ch));
            }
        }

        return stack.peek();
    }
    public static void main(String[] args) {
        String prefixExp="*-a/bc-/ade";
        System.out.println("Prefix Expression : "+prefixExp);
        System.out.println("Postfix Expression : "+prefixToPostfix(prefixExp));
    }
}
