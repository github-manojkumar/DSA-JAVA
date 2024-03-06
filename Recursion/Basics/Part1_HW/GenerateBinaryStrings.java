package DSA_Java.Recursion.Basics.Part1_HW;

public class GenerateBinaryStrings {

    public static void main(String[] args) {
        System.out.println("String : ");
        generateBinaryStrings(3);

    }
    private static void generateBinaryStrings(int n){
        generateBinString(n-1,0,"");
        generateBinString(n-1,1,"");
    }
    /*
        - Brute Force Way
        - We know we can fill the string starting with either 0 or 1, we have two choices
            choose 0 or choose 1
            but when 1 is chosen then it is mandatory that the next choice should be 0
        - length of the string is n
     */
    private static void generateBinString(int n, int chosenNumber, String str){
        if(n==0) {
            str+=chosenNumber;
            System.out.println(str);
            return;
        }
        str+=chosenNumber;
        if(chosenNumber==0){
            generateBinString(n-1,0,str);
            generateBinString(n-1,1,str);
        }else if(chosenNumber==1){
            generateBinString(n-1,0,str);
        }
    }
}
