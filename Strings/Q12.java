package strings;

import java.util.Random;
import java.util.Scanner;

public class Q12 {
    public static int [] generateRandrom(int n){
        int ages[]= new int [n];
        Random rand= new Random();
        for(int i=0;i<n;i++){
            ages[i]= rand.nextInt(90)+10;
        }
        return ages;
    }
    public static String[][] validateVoter(int ages[]){
        String arr2 [] [] = new String[ages.length][2];
        for(int i=0;i<ages.length;i++){
           int temp=ages[i];
         if(temp<=0 || temp<18){
            arr2[i][0]=String.valueOf(ages[i]);
            arr2[i][1]="false";
         } 
         else{
            arr2[i][0]=String.valueOf(ages[i]);
            arr2[i][1]="true";
         }  
        }
        return arr2;
    }
    public static void displayArray( String arr2[][]){
            for(int i=0;i<arr2.length;i++){
                for(int j=0;j<arr2[i].length;j++){
                    System.out.println(arr2[i][0] +"  " + arr2[i][1] );
                }
            }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
       int ages[]=generateRandrom(n);
       String arr2[][]= validateVoter(ages);
        displayArray(arr2);
    }
    
}
