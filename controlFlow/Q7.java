import java.util.*;
class Q7
{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int n= sc.nextInt();
	System.out.printf("Is the number %d divisible by 5? %b" , n, (n%5==0));
}
}