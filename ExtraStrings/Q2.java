// 2. Reverse a String
// Problem:
// Write a Java program to reverse a given string without using any built-in reverse
// functions

package ExtraStrings;

import java.util.Scanner;

public class Q2 {
        public static String Count(String str){
            String result= "";
            for(int i=str.length()-1;i>=0;i--){
                result+=str.charAt(i);
            }
            return result;
        }

        public static void inOut(){
            Scanner sc = new Scanner(System.in);
            System.out.println("enter string to reverse");
            String str= sc.nextLine();
            String revers= Count(str);
            System.out.println("orginal is " + str + "\n revered is"+ revers);
        }
        public static void main(String[] args) {
            inOut();
        }
    
}
