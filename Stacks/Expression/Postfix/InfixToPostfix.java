package DSA_Java.Stacks.Expression.Postfix;

import java.util.Stack;

public class InfixToPostfix {

    public static boolean isOperand(char ch){
        return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9');
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

    public static String infixToPostfix(String exp){
        StringBuilder postfixExp=new StringBuilder();
        Stack<Character> stack=new Stack<>();

        for(int i=0;i<exp.length();i++){
            char ch=exp.charAt(i);
            //When [char => operand or alphabet] append operand to the postfix expression
            if(isOperand(ch)) postfixExp.append(ch);

            //When [char => '('] push '( to stack
            else if(ch=='(') stack.push(ch);

            // When [char => ')'] pop all the operators from stack until '(' is not encounter and append all the popped operators into postfix expression
            else if(ch==')'){
                while(!stack.isEmpty() && stack.peek()!='(') {
                    postfixExp.append(stack.pop());
                }
                stack.pop();
            }

            else{
                while(!stack.isEmpty() && stack.peek()!='(' && precedence(stack.peek())>=precedence(ch)){
                    postfixExp.append(stack.pop());
                }
                stack.push(ch);
            }

        }
        while(!stack.isEmpty()){
            if(stack.peek()!='(' || stack.peek()!=')'){
                postfixExp.append(stack.peek());
            }
            stack.pop();
        }

        return postfixExp.toString();
    }

    public static void main(String[] args) {
        String exp="A+B*(C+D)";
//        String exp="((A+B)-C*(D/E))+F";

        System.out.println("Infix Expression "+exp);
        System.out.println("Postfix Expression "+infixToPostfix(exp));
    }
}
