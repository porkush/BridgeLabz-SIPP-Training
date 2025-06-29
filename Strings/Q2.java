package strings;

import java.util.Scanner;

public class Q2 {
    public static void generateException(String s){
        System.out.println("generating stringindexoutofBoundException...");
        char ch= s.charAt(s.length());
        System.out.println("char at invalid index" + ch);
    } 
    public static void handleException(String s){
        try{
            System.out.println("Handling StringIndexOutOfBoundsException");
            char ch= s.charAt(s.length());
            System.out.println("character at invalid index:" + ch);
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println("caught exception" + e.getMessage());
        }
    }  
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter string");
        String s= sc.next();
        //generateException(s);
        handleException(s);
    }
    
}
