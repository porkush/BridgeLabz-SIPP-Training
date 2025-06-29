package strings;

import java.util.Scanner;

public class Q1 {
    
    public static String subString(String s,int start, int end){
        String result="";
        for(int i=start;i<end;i++){
            result+=s.charAt(i);
        }
        return result;
    }

    public static boolean checkEqaul(String result, String s){
        if(result.length()!= s.length()){
            return false;
        }
        else{
            for(int i=0;i<result.length();i++){
                if(result.charAt(i)!=s.charAt(i)){
                    return false;
                }
            }
            return true;
        }
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter string");
    String s= sc.next();
    System.out.println("enter first index from which you want");
    int start= sc.nextInt();
    System.out.println("enter last from where you want");
    int end= sc.nextInt();

    String st= subString(s, start, end);
    System.out.println(st);
    
    System.out.println(checkEqaul(s, st));
    
    }
    
}
