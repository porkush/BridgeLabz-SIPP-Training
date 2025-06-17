import java.util.Scanner;
public class Q27 {
        public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
	System.out.println("Enter number");
        int n= sc.nextInt();
	int counter=n;
	if(n<100 && n>0){
	while(counter<100){
	counter+=n;
	System.out.println(counter); 
	}
}
	else{
	System.out.println("number not valid");
	}
}
}

