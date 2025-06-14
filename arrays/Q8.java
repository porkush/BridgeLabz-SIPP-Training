import java.util.Scanner;
class Q8{
public static void main(String[]args){

	Scanner sc = new Scanner(System.in);
	System.out.println("enter rows & columns");
	int r=sc.nextInt();
	int c= sc.nextInt();
	int arr[][]= new int[r][c];
	int index=0;
	for(int i=0;i<arr.length;i++){
		for(int j=0;j<arr[i].length;j++){
		arr[i][j]=sc.nextInt();
}
}	
	int arr1[]=new int[r*c];
	for(int i=0;i<arr.length;i++){
	for(int j=0;j<arr[i].length;j++){
		arr1[index++]=arr[i][j];
	}}
	for(int i:arr1){
	System.out.println(i + "");
	}
	 
}	
}	

