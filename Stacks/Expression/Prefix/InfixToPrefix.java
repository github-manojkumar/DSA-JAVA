package DSA_Java.Stacks.Expression.Prefix;

import java.util.Stack;

public class InfixToPrefix {
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

    public static String infixToPrefix(String exp){

        Stack<Character> stack=new Stack<>();
        StringBuilder prefixExpression=new StringBuilder();
        int n=exp.length();
        for(int i=n-1;i>=0;i--){
            char ch=exp.charAt(i);
            if(isOperand(ch)) prefixExpression.append(ch);

            else if(ch==')') stack.push(ch);

            else if(ch=='('){
                while(!stack.isEmpty() && stack.peek()!=')') {
                    prefixExpression.append(stack.pop());
                }
                stack.pop();
            }
            else{
                while(!stack.isEmpty() && stack.peek()!=')' && precedence(stack.peek())>precedence(ch)){
                    prefixExpression.append(stack.pop());
                }
                stack.push(ch);
            }
        }

        while(!stack.isEmpty()){
            prefixExpression.append(stack.pop());
        }

        return prefixExpression.reverse().toString();
    }

    public static void main(String[] args) {
//        String exp="a*(b+c+d)";
//        String exp="(A+B)-C*(D/E)+F";
        String exp="((A*B)/(C/D))*E/F*G*(H-I+J)+K/L*M/N";//+**/*/*AB/CDEFG+-HIJ/*/KLMN
        System.out.println("Infix Expression "+exp);
        System.out.println("Prefix Expression "+infixToPrefix(exp));
    }
}
