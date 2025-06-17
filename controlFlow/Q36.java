import java.util.Scanner;
public class Q36 {
        public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
	System.out.println("Enter weight in kg");
        double kg= sc.nextDouble();
	System.out.println("Enter height in cm");
        double cm= sc.nextDouble();
	double heightInMeters= cm/100;
	double ans= kg/(heightInMeters*heightInMeters);
	System.out.printf("your bmi is %.2f you're %s\n",ans, (ans<=18.4?"Underweight":ans>=18.5&&ans<=24.9?"Normal":ans>=25.0&&ans<=39.9?"overweight":"obese") ); 
}
}
