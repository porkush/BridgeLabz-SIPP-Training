package strings;

import java.util.Scanner;

public class Q7 {
    public static void generateException(String s){
            String text= null;
            System.out.println(text.toUpperCase());
    }

    public static void handleException(String s){
            try{
                generateException(s);
            }
            catch(NullPointerException e){
                System.out.println("handling exception " + e.getMessage());
            }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter string");
        String s= sc.nextLine();
        handleException(s);
    }
}
