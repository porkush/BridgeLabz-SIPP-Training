import java.util.Scanner;
public class Q15 {
        public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
	System.out.println("Enter number");
        int num= sc.nextInt();
	int fact=0;
	if( num >0){
	while(num>0){
	fact= fact*num;
	num--;
	}
	}
	else{
	System.out.println("factorial not possible");
} 
    }
    }

