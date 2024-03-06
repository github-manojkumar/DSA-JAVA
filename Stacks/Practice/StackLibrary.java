package DSA_Java.Stacks.Practice;

import java.util.Stack;

public class StackLibrary {
    static Stack<String> canonicalPath=new Stack<>();
    public static void upatePath(String command){
        if(command.equals("..")){
            if(!canonicalPath.isEmpty()) canonicalPath.pop();
        }
        else if(!command.equals(".")) canonicalPath.push(command);

    }
    public static String simplifyPath(String path) {
        String[] p=path.split("/");
        canonicalPath.clear();
        boolean flag=false;
        String command="";
        for(int i=0;i<path.length();i++){
            char ch=path.charAt(i);
            if(ch=='/' && flag){
                flag=false;
                upatePath(command);
                command="";
            }else if(ch!='/'){
                flag=true;
                command+=ch;
            }

            if(i==path.length()-1 && !command.isEmpty()){
                upatePath(command);
            }
        }

        StringBuilder sb=new StringBuilder();
        for(String comm:canonicalPath){
            sb.append("/");
            sb.append(comm);
        }
        if(sb.isEmpty()) sb.append("/");
        return sb.toString();
    }

    public static void main(String[] args) {
        String str="/home/";
        System.out.println(simplifyPath(str));
        char ch='a'+1;
        System.out.println(ch);
    }
}
