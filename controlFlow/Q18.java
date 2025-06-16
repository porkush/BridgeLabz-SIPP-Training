import java.util.Scanner;
public class Q18 {
        public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
	System.out.println("Enter number");
        int n= sc.nextInt();
	if(n%3==0 && n%5==0){
	while(n>0){
	System.out.println("FrizzBuzz");
	n--;	
	}
	}
	else if(n%3==0){
	while(n>0){
	System.out.println("Frizz");
	n--;
	}
	}
	else if(n%5==0){
	while(n>0){
	System.out.println("Buzz");
	n--;
	}	
	}	
	else{
	System.out.println("number not as per requirement");}
}
}

