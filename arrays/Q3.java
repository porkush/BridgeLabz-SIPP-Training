import java.util.Scanner;
class Q3{
public static void main(String[]args){

	Scanner sc = new Scanner(System.in);
	double arr[]= new double[10];
	double sum=0;
	int index=0;
	while(true){
	if(index>=10){
	break;
	}
	System.out.printf("enter %d number", index);
	arr[index]=sc.nextDouble();
	if(arr[index]==0||arr[index]<=0){
	System.out.println(sum);
	break;}
	sum+=arr[index];
	index++;
	}
	}
}
