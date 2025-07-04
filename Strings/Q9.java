package strings;

import java.util.Scanner;

public class Q9 {
    public static boolean Mequals(String s, String s1){
            if(s.length()!=s1.length()){
                return false;
            }
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)!=s1.charAt(i)){
                    return false;
                }
            }
            return true;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter string 1");
        String s= sc.next();
        System.out.println("Enter string 2");
        String s1= sc.next();
        boolean b= Mequals(s, s1);
        boolean builtin= s.equals(s1);
        System.out.println(b==builtin?"same":"different");
    }
    
}
