package strings;

import java.util.Scanner;

public class Q4 {
    public static String convertLowercase(String s){
        String result = "";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
            ch = (char) (ch+32);
            }
            result+=ch;
        }
        return result;
    }
    public static boolean compareTwo(String s, String lower){
        if(s.length()!=lower.length()){
            return false;
        }
        else{
            for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=lower.charAt(i)){
                return false;
            }
            }
            return true;   
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the line");
        String s= sc.nextLine();
        String lower=s.toLowerCase();
        s=convertLowercase(s);
        System.out.println(compareTwo(s, lower));
    }
    
}
