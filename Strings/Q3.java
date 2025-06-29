package strings;

import java.util.Scanner;

public class Q3 {
    public static void generateException(String s){
        System.out.println("generating Exception");
        int c= Integer.parseInt(s);
    }
    public static void handleException(String s){
        try{
            System.out.println("Handling NumberFormatException");
            int c= Integer.parseInt(s);
            System.out.println("int "+ c);
        }
        catch(NumberFormatException e){
            System.out.println("NumberFormatException" + e.getMessage());
        }
    }
    public static void main(String[] args) {
          Scanner sc= new Scanner(System.in);
        System.out.println("enter string");
        String s= sc.next();
        // generateException(s);
        handleException(s);
    }
    
}
