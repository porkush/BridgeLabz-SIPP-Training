import java.util.Scanner;
class Q6{
public static void main(String[]args){

	Scanner sc = new Scanner(System.in);
	int arr[]= new int[10];
	int n=sc.nextInt();
	if(n>=6 && n<=9){
	for(int i=0;i<arr.length;i++){
	arr[i]=n*(i+1);
}
}	
	else{
	System.out.println("type number between 6&9");}
	for(int element:arr){
	System.out.println(element);	
}	}
}
