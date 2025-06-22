// 1. Count Vowels and Consonants
// Problem:
// Write a Java program to count the number of vowels and consonants in a given string.

package ExtraStrings;

import java.util.Scanner;

public class Q1 {
        public static int[] Count(String str){
            int vowels=0;
            int consonants=0;
            for(int i=0;i<str.length();i++){
                char temp=str.charAt(i);
                if(temp=='a'||temp=='e'||temp=='i'||temp=='o'||temp=='u'){
                    vowels++;
                }
                else if(temp==' '){
                    continue;
                }
                else{
                    consonants++;
                }
            }
            return new int [] {vowels, consonants};
        }

        public static void inOut(){
            Scanner sc = new Scanner(System.in);
            System.out.println("enter string to find vowel and consonents");
            String str= sc.nextLine();
            int ar[]= Count(str);
            int vowels= ar[0];
            int consonants= ar[1];
            System.out.println("number of vowels in " + str + "="+vowels);
            System.out.println("number of consonents in " + str + "="+consonants);
        }
        public static void main(String[] args) {
            inOut();
        }
    
}
