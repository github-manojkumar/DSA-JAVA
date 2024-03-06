package DSA_Java.Stacks.Expression.ExpressionEvaluation;

import java.util.Stack;

public class PostfixEvaluation {

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
    public static int evaluatePostfixExp(String exp){
        Stack<Integer> stack=new Stack<>();
        int n=exp.length();
        for(int i=0;i<n;i++){
            char ch=exp.charAt(i);
            if(isOperand(ch)) stack.push(ch-'0');
            else{
                int op2=stack.pop();
                int op1=stack.pop();
                stack.push(performOperation(op1,op2,ch));
            }
        }
        return stack.peek();
    }

    public static void main(String[] args) {
        String exp="23+45-*";
        System.out.println("Postfix Expression : "+exp);
        System.out.println("Result : "+evaluatePostfixExp(exp));
    }
}
