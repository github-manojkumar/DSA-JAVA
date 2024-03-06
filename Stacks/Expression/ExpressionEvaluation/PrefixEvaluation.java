package DSA_Java.Stacks.Expression.ExpressionEvaluation;

import java.util.Stack;

public class PrefixEvaluation {

    public static boolean isOperand(char ch){
        return (ch >= '0' && ch <= '9');
    }

    public static int performOperation(int op1,int op2,char operator){
        int result=0;
        switch (operator){
            case '+':
                result=op1+op2;
                break;
            case '-':
                result=op1-op2;
                break;
            case '%':
                result=op1%op2;
                break;
            case '*':
                result=op1*op2;
                break;
            case '/':
                result=op1/op2;
                break;
            case '^':
                result=op1^op2;
                break;
            default:
                break;
        }
        return result;
    }
    public static int evaluatePrefixExp(String exp){
        Stack<Integer> stack=new Stack<>();
        int n=exp.length();
        for(int i=n-1;i>=0;i--){
            char ch=exp.charAt(i);
            if(isOperand(ch)) stack.push(ch-'0');
            else{
                int op1=stack.pop();
                int op2=stack.pop();
                stack.push(performOperation(op1,op2,ch));
            }
        }
        return stack.peek();
    }

    public static void main(String[] args) {
        String exp="+9*26";
        System.out.println("Postfix Expression : "+exp);
        System.out.println("Result : "+evaluatePrefixExp(exp));
    }
}
