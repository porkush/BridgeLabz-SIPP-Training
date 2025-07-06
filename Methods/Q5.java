package Methods;

import java.util.Scanner;

public class Q5 {

    public static String input(){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your word,phrase or sentence");
        String str = sc.nextLine();
        return str;
    }
    public static void checkPalindrome(){
        String str= input();
        if(str.length()<=1){
            System.out.println("palindrome");
            return;
        }
        int end= str.length()-1;
        for(int i=0;i<=end;i++){
            if(str.charAt(i)!=str.charAt(end)){
                System.out.println("not palindrome");
                return;
            }
            end--;
        }
        System.out.println("palindrome");
    }
    public static void main(String[] args) {
        checkPalindrome();
    }
    
}
