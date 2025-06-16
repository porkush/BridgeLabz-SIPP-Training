import java.util.Scanner;
public class Q17 {
        public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
	System.out.println("Enter  height & age for first");
        int n1= sc.nextInt();
	int a1=sc.nextInt();
	System.out.println("Enter height & age for second");
 	int n2= sc.nextInt();
	int a2=sc.nextInt();	
	System.out.println("Enter height & age for third");
 	int n3= sc.nextInt();
	int a3=sc.nextInt();	      
	String youngest= (a1<=a2 && a1<=a3)?"Amar":(a2<=a1 && a2<=a3)?"Akbar":"Anthony";
	String tallest= (a1>=a2 && a1>=a3)?"Amar":(a2>=a1 && a2>=a3)?"Akbar":"Anthony";
	System.out.println("youngest" + youngest);
	System.out.println("tallest" + tallest);
}
}

