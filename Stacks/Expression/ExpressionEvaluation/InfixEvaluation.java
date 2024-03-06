package DSA_Java.Stacks.Expression.ExpressionEvaluation;

import java.util.Stack;

public class InfixEvaluation {

    public static Stack<Integer> operandStack=new Stack<>();
    public static Stack<Character> operatorStack=new Stack<>();
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
    public static boolean isOperand(char ch){
        return (ch >= '0' && ch <= '9');
    }
    public static int precedence(char op){
        return switch (op) {
            case '*', '/', '%' -> 5;
            case '+', '-' -> 4;
            case '&' -> 3;
            case '^' -> 2;
            case '|' -> 1;
            default -> 0;
        };
    }
    public static void evaluateExp(){
        int op2=operandStack.pop();
        int op1=operandStack.pop();
        char operator=operatorStack.pop();
        operandStack.push(performOperation(op1,op2,operator));
    }
    public static int evaluateInfix(String exp){
        for(int i=0;i<exp.length();i++){
            char ch=exp.charAt(i);
            //When [char => operand or alphabet] append operand to the postfix expression
            if(isOperand(ch)) operandStack.push(ch-'0');
            //When [char => '('] push '( to stack
            else if(ch=='(') operatorStack.push(ch);
            // When [char => ')'] pop all the operators from stack until '(' is not encounter and append all the popped operators into postfix expression
            else if(ch==')'){
                while(!operatorStack.isEmpty() && operatorStack.peek()!='(') {
                    evaluateExp();
                }
                operatorStack.pop();
            }
            else{
                while(!operatorStack.isEmpty() && operatorStack.peek()!='(' && precedence(operatorStack.peek())>=precedence(ch)){
                    evaluateExp();
                }
                operatorStack.push(ch);
            }

        }
        while(!operatorStack.isEmpty()){
            if(operatorStack.peek()!='(' || operatorStack.peek()!=')'){
                evaluateExp();
            }else{
                operatorStack.pop();
            }
        }

        return operandStack.peek();
    }

    public static void main(String[] args) {
        String exp="1+2*(4/2)*3+1/2-1";
//        String exp="5+2*(3-4+2/3)*4+2";

        System.out.println("Infix Expression "+exp);
        System.out.println("Postfix Expression "+evaluateInfix(exp));
    }
}
