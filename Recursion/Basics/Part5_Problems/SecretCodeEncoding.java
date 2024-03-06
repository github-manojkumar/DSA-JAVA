package DSA_Java.Recursion.Basics.Part5_Problems;

public class SecretCodeEncoding {

    public static char[] encoding= {' ','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

    public static void seeEncoding(String code,int idx,String output){
        if(idx>=code.length()){
            System.out.println(output);
            return;
        }
        int value=Integer.parseInt(String.valueOf(code.charAt(idx)));
        seeEncoding(code,idx+1,output+encoding[value]);
        if(idx<code.length()-1){
            value=(value*10)+Integer.parseInt(String.valueOf(code.charAt(idx+1)));
            if(value<=26){
                seeEncoding(code,idx+2,output+encoding[value]);
            }
        }
    }
    public static void main(String[] args) {
        seeEncoding("25114",0,"");
    }
}
