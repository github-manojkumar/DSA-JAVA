package DSA_Java.Stacks.Expression.Infix;

import java.util.Stack;

public class PostfixToInfix {

    public static boolean isOperand(char ch){
        return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9');
    }

    public static String postfixToInfix(String exp){
        Stack<String> stack=new Stack<>();
        int n=exp.length();

        for(int i=0;i<n;i++){
            char ch=exp.charAt(i);
            if(isOperand(ch)) stack.push(String.valueOf(ch));
            else{
                String op1=stack.pop();
                String op2=stack.pop();
                String newOperand="("+op2+ch+op1+")";
                stack.push(newOperand);
            }
        }
        return stack.peek();
    }

    public static void main(String[] args) {
        String postfixExp="abc/-ad/e-*";
        System.out.println("Postfix Expression : "+postfixExp);
        System.out.println("Infix Expression : "+postfixToInfix(postfixExp));
    }
}
