import java.util.Scanner;

class Q19             {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of students");
        int n= sc.nextInt();
        int physics[]= new int[n];
        int chem[]= new int[n];
        int maths[]= new int[n];
        double[] percentage= new double[n];
        char[] grade = new char[n];
        for(int i=0;i<n;i++){
            System.out.println("enter marks for student" + (i+1));

            System.out.println("Physics: ");
            physics[i]=sc.nextInt();
            if(physics[i]<0){
                System.out.println("Invalid marks! Re-enter");
                i--;
                continue;
            }
            System.out.println("chemistry: ");
            chem[i]=sc.nextInt();
            if(chem[i]<0){
                System.out.println("Invalid marks! Re-enter");
                i--;
                continue;
            }System.out.println("Maths: ");
            maths[i]=sc.nextInt();
            if(maths[i]<0){
                System.out.println("Invalid marks! Re-enter");
                i--;
                continue;
            }
           
             percentage[i]=(physics[i]+chem[i]+maths[i])/3.0;
            if (percentage[i] >= 80) grade[i] = 'A';
                else if (percentage[i] >= 70) grade[i] = 'B';
                else if (percentage[i] >= 60) grade[i] = 'C';
                else if (percentage[i] >= 50) grade[i] = 'D';
                else if (percentage[i] >= 40) grade[i] = 'E';
                else grade[i] = 'F';
            }
      
                    for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1));
            System.out.println("Physics: " + physics[i]);
            System.out.println("Chemistry: " + chem[i]);
            System.out.println("Maths: " + maths[i]);
            System.out.printf("Percentage: %.2f%%\n", percentage[i]);
            System.out.println("Grade: " + grade[i]);
            System.out.println("------------------------");
        }


    }
}
