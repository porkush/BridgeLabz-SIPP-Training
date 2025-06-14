import java.util.Scanner;
class Q4{
public static void main(String[]args){

	Scanner sc = new Scanner(System.in);
	double arr[]= new double[11];
	double sum=0;
	for(int i=0;i<arr.length;i++){
	arr[i]=sc.nextDouble();
	sum+=arr[i];
}
	System.out.printf("mean height is %.2f ",(sum/11.0));
	}
}
