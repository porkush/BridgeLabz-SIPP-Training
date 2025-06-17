import java.util.Scanner;
public class Q26 {
        public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
	System.out.println("Enter number");
        int n= sc.nextInt();
	int i =1;
	while(i<=n){
	if(i%2==0 && i>0){
	System.out.println("even " + i);
	}
	else{
	System.out.println("odd " + i);
}
	i++;	
        }
}
}
