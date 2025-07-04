package strings;

import java.util.Scanner;

public class Q5 {

    public static void GenerateException(String s){
        int start= s.length();
        int end=0;
         if (start > end) {
            throw new IllegalArgumentException("IllegalArgumentException");
        }
    //    String sub= s.substring(s.length(),0);
    //     System.out.println("substring is" + sub);
    }

    public static void handleException(String s){
        try{
        GenerateException(s);
        }
        catch (IllegalArgumentException e) {
        System.out.println( e.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter string");
        String s= sc.nextLine();
        // GenerateException(s);
        handleException(s);
    }
    
}
