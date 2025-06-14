import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for which you want to find largest and second largest digit");
        int n= sc.nextInt();
        int maxDigit= 10;
        int []digit= new int[maxDigit];
        int largest=-1;
        int secondLargest=-1;
        int index=0;
        while (n>0) {
            digit[index]=n%10;
            n/=10;
            index++;
                }
        for(int i=0;i<index;i++){
            if(digit[i]> largest){
                secondLargest= largest;
                largest= digit[i];
            }
            else if(digit[i]>secondLargest && digit[i]!=largest){
                secondLargest= digit[i];
            }
        } 
  System.out.println(
            "Largest: " + largest + 
            (secondLargest == -1 
                ? "\nThere is no second largest digit." 
                : "\nSecond Largest: " + secondLargest)
        );
    }
}
