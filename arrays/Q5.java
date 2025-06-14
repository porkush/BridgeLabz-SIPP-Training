import java.util.Scanner;
class Q5{
public static void main(String[]args){

	Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]= new int[10];
	for(int i=0;i<arr.length;i++){
	arr[i]=n*(i+1);
}
	for(int element:arr){
	System.out.println(element);	
}	}
}
