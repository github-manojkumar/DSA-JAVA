package DSA_Java.Recursion.Basics.Part5_Problems;

import java.util.ArrayList;
import java.util.List;

public class ParenthesisProblem {

    static List<String> result=new ArrayList<>();

    public static void validParenthesis(int n,int starting,int ending,String output){
        if(ending==n){
            result.add(output);
            return;
        }

        if(starting>ending){
            validParenthesis(n,starting,ending+1,output+")");
        }
        if(starting<n){
            validParenthesis(n,starting+1,ending,output+"(");
        }

//        else if(starting==ending){
//            validParenthesis(n,starting+1,ending,output+"(");
//        }else if(starting==n){
//            validParenthesis(n,starting,ending+1,output+")");
//        }else{
//
//            validParenthesis(n,starting,ending+1,output+")");
//        }
    }

    public static void main(String[] args) {
        int n=3;
        validParenthesis(n,0,0,"");
        System.out.println(result);
    }
}
