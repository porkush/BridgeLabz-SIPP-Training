import java.util.Scanner;
class Q7{
public static void main(String[]args){

	Scanner sc = new Scanner(System.in);
	int arr[]= new int[5];
	for(int i=0;i<arr.length;i++){
	arr[i]=sc.nextInt();
}	
	for(int ele:arr){
	System.out.println("the number is " +
	(ele>0?("Positive" + (ele%2==0?" even":"odd")):
	ele==0?"Zero":"Negative"));	
}
	System.out.println("compare first and last "+ (arr[0]==arr[4]?"Equal":arr[0]>arr[4]?"greater":"less"));
}	
}	

