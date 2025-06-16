import java.util.Scanner;
public class Q13 {
        public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
	System.out.println("Enter date");
        int date= sc.nextInt();
	System.out.println("Enter month");
	int month= sc.nextInt();
	if( date <= 20 && month>=3 && month<=6){
	System.out.println("spring season");
	}
	else{
	System.out.println("Not spring season");
} 
    }
    }

