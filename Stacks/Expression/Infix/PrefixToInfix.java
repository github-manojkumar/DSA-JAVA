package DSA_Java.Stacks.Expression.Infix;

import java.util.Stack;

public class PrefixToInfix {

    public static boolean isOperand(char ch){
        return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9');
    }

    public static String prefixToInfix(String exp){

        Stack<String> stack=new Stack<>();
        int n=exp.length();
        for(int i=n-1;i>=0;i--){
            char ch=exp.charAt(i);
            if(isOperand(ch)) stack.push(String.valueOf(ch));
            else{
                String op1=stack.pop();
                String op2=stack.pop();
                String newOperand="("+op1+ch+op2+")";
                stack.push(newOperand);
            }
        }
        return stack.peek();
    }
    public static void main(String[] args) {
        String prefixExp="*-a/bc-/ade";
        System.out.println("Prefix Expression : "+prefixExp);
        System.out.println("Infix Expression : "+prefixToInfix(prefixExp));
    }
}
