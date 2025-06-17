import java.util.Scanner;
public class Q29 {
        public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
	System.out.println("enter number to find it's greatest divisible");
        int n= sc.nextInt();
	int counter= n-1;
	while(counter>0){
	if(n%counter==0){
	System.out.println("greatest divisible = " + counter );
	break;
}
	counter--;
}
}		
}


