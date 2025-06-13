import java.util.*;
class Q28
{
    public static void main (String []args){
	Scanner sc= new Scanner(System.in);
	 double Principal = sc.nextDouble();
	 double Rate = sc.nextDouble();
	 double Time = sc.nextDouble();
	 double si= (Principal*Rate*Time)/100;
	 System.out.printf("The Simple Interest is %.2f for Principal %f, Rate of Interest %f and Time %f", si, Principal,Rate,Time);
}
}