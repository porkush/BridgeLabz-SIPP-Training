import java.util.Scanner;
public class Q31 {
        public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
	System.out.println("Enter marks physics");
        int p= sc.nextInt();
	System.out.println("Enter marks chemistry");
        int c= sc.nextInt();
	System.out.println("Enter marks maths");
        int m= sc.nextInt();
	int per= ((m+c+p)*100)/300;
	String n= per>=80?"A":
		per>=70?"B":
		per>=60?"C":
		per>=50?"D":
		per>=40?"E":"F";
	System.out.println(n);
}
}
