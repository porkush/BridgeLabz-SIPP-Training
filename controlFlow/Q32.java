import java.util.Scanner;
public class Q32 {
        public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
	System.out.println("Enter prime");
        int n= sc.nextInt();
	Boolean prime= true;
	for(int i=2;i<n;i++){
	if(n%i==0){	
	prime = false;
	break;
	}
	}
	System.out.println(prime==true?"yes":"no"); 
}
}
