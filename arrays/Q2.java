import java.util.Scanner;
class arrayfactorQ1{
public static void main(String[]args){

	Scanner sc = new Scanner(System.in);
	int arr[]= new int[10];
	int eligible=0;
	int noteligible=0;
	for(int i=1;i<arr.length;i++){
	arr[i]=sc.nextInt();
	}
	for(int i=0;i<arr.length;i++){
	if(arr[i]>=18){
	System.out.printf("The student with the age %d can vote",arr[i]);
	eligible++;
	}
	else{
	System.out.printf("The student with the age %d cannot vote.", arr[i]);
	noteligible++;
	}
	}
	}
}
