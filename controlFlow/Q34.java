import java.util.Scanner;
public class Q34 {
        public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
	System.out.println("Enter year");
        int n= sc.nextInt();
	Boolean b=false;
	if(n>=1582 && n%4==0 && (n%100!=0 || n%400==0)){
	b=true;
	}
	System.out.println(b==true?"yes leap year":"not leap"); 
}
}
