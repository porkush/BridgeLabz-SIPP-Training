import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of students of you want to find out tallest & youngest");
    int n= sc.nextInt();
    double height[]= new double[n];
    double age[]= new double[n];
    int tallestHeight=0;
    int youngestAge=0;
    for(int i=0;i<n;i++){
        System.out.println("Enter height for student" + i+1 );
        height[i]=sc.nextDouble();
        System.out.println("Enter age for student" + i+1 );
        age[i]= sc.nextDouble();
    }
    for(int i=0;i<n;i++){
        if(height[i]>height[tallestHeight]){
             tallestHeight=i;
        }
        if(age[i]<age[youngestAge]){
            youngestAge=i;
        }
    }
    System.out.println("tallest of them is " + (tallestHeight==0?"Amar":tallestHeight==1?"Akbar":"Anthony" )  );
    System.out.println("youngest of them is " + (youngestAge==0?"Amar":youngestAge==1?"Akbar":"Anthony") );

    }
}
