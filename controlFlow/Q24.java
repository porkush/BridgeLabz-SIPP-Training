import java.util.Scanner;
public class Q24 {
        public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
	System.out.println("salary");
        int s= sc.nextInt();
	System.out.println("year of service");
	int yos= sc.nextInt();
	if(2025-yos>=5){
	System.out.println((s*5/100)+s);
	}
	else{
	System.out.println("less than 5 year service");}
}
}
