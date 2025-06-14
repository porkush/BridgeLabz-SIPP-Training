import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number of employees");
        int n= sc.nextInt();
        double sal[][]= new double[n][2];
        double newsal[][]= new double[n][2];
        double totalbonus=0.0;
        double totaloldSalary=0.0;
        double totnewSalary=0.0;
        for(int i=0;i<n;i++){
            System.out.println("enter salary");
            sal[i][0]= sc.nextDouble();
            if(sal[i][0]<0){
                System.out.println("invalid number, enter correct input");
                i--;
                continue;
            }
            totaloldSalary+=sal[i][0];
            System.out.println("years of service");
            sal[i][1]=sc.nextDouble();
            if (sal[i][1]<0){
                System.out.println("invalid number, enter correct input");
                i--;
                continue;
            }
        }
        for(int i=0;i<n;i++){
            if(sal[i][1]>5){
                double bonus= ((sal[i][0])*5)/100;
                totalbonus+=bonus;
                newsal[i][0]= sal[i][0] + bonus;
                totnewSalary+=newsal[i][0];
                newsal[i][1]=bonus;
            }
            else if(sal[i][1]<5){
                double bonus= ((sal[i][0])*2)/100;
                totalbonus+=bonus;
                newsal[i][0]= sal[i][0] + bonus;
                totnewSalary+=newsal[i][0];
                newsal[i][1]=bonus;
            }
        }
            System.out.printf("total bonus payout %.2f \n total old slary %.2f\n",totalbonus, totaloldSalary);
                    for(int i=0;i<n;i++){
                     System.out.println("salary of employee "+(i+1) +" " + newsal[i][0]);
        }

    }
}
