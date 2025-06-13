import java.util.*;
class Q25
{
    public static void main (String []args){
	Scanner sc= new Scanner(System.in);
	 int s1 = sc.nextInt();
	 int s2= sc.nextInt();
	 int s3= sc.nextInt();
	 int peri= s1+s2+s3;
	 int cl= 5000/peri;
	 System.out.printf("The total number of rounds the athlete will run is %d to complete 5 km ",cl);
}
}