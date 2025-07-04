import java.util.Scanner;

public class Q6{

    public static String convertUppercase(String s){
        String result= "";
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            if(c>='a' && c<='z'){
                c=(char) (c-32);
                result+=c;
            }
            else{
                result+=c;
            }
        }
        return result;
    }

    public static boolean compare(String s, String upper){
        if (s.length()!=upper.length()) {
            return false;
        }
        for(int i=0;i<s.length();i++){
         if(s.charAt(i)!=upper.charAt(i)){
            return false;
        }
    }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String s = sc.nextLine();
        String upper= s.toUpperCase();
        s= convertUppercase(s);
        System.out.println(s);
        System.out.println(compare(s, upper));
    }
}
