package DSA_Java.Recursion.Basics.Part2_HW;

public class StringToNumber {

    public static int stringToNumber(String strNum,int idx){
        if(idx==strNum.length()){
            return 0;
        }
        int currentIndexValue=strNum.charAt(idx)-'0';
        int result= (int) (currentIndexValue*Math.pow(10,strNum.length()-1-idx));
        return result+stringToNumber(strNum,idx+1);

    }

    public static void main(String[] args) {

        System.out.println(stringToNumber("1234",0));
    }
}
