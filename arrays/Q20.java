import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter number of persons");
    int n= sc.nextInt();
    double [][] personData= new double[n][3];
    String[] weightStatus= new String[n];

    for(int i=0;i<n;i++){
            System.out.println("enter weight in kg for" + (i+1));
            personData[i][0]=sc.nextDouble();
            if(personData[i][0] <0){
                System.out.println("enter valid input");
                i--;
                continue;
            }
            System.out.println("enter height in cm" + (i+1));
            personData[i][1]=sc.nextDouble();
            personData[i][1]/=100.0;
            if(personData[i][1]<0){
                System.out.println("enter valid input");
                i--;
                continue;
            }
            personData[i][2]= (personData[i][0]/ (personData[i][1]*personData[i][1]));
            if(personData[i][2]<=18.4){
                weightStatus[i]= "Underweight";
            }
            else if(personData[i][2]>18.5 && personData[i][2]<24.9){
                weightStatus[i]="Normal";
            }
            else if(personData[i][2]>25.0 && personData[i][2]<39.9){
                weightStatus[i]="Overweight";
            }
            else if(personData[i][2]>40.0 ){
                weightStatus[i]="obese";
            }

        }

        System.out.println("\nBMI Report:");
        for (int i = 0; i < n; i++) {
            System.out.printf("Person %d -> Weight: %.1f kg, Height: %.2f m, BMI: %.2f, Status: %s\n",
                i + 1, personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }

                
    }
    }
    


