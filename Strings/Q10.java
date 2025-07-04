package strings;
import java.util.*;

public class Q10 {
    public static char[] getCharacter(String s){
        char arr[]= new char[s.length()];
        for(int i=0;i<s.length();i++){
            arr[i]= s.charAt(i);
        }
        return arr;
    }

    public static boolean comparearr(char[] arr, char[] arr1){
        if(arr.length!=arr1.length){
            return false;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=arr1[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter String");
        String s= sc.next();
        char arr[]= getCharacter(s);
        char arr1[]= s.toCharArray();
        System.out.println(comparearr(arr, arr1));
    }
    
}
