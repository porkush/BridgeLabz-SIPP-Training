import java.util.Scanner;
public class Q28 {
        public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
	System.out.println("enter number to find it's greatest divisible");
        int n= sc.nextInt();
	for(int i=n-1;i<n;i--){
	if(n%i==0){
	System.out.println("greatest divisible = " + i );
	break;
}
	}		
}
}

