package ExtraStrings;

import java.util.Scanner;

public class Q5 {
    public static String longestWord(String s){
        String arr[]= s.split(" ");
        String longest= "";
        for(String word: arr){
            if(word.length()>longest.length()){
                longest= word;
            }
        }
        return longest;

    }
    
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter string");
        String s= sc.nextLine();
        String longest= longestWord(s);
        System.out.println("longest word is " + longest);
    }
}
