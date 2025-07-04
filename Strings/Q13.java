package strings;

import java.util.Random;
import java.util.Scanner;

public class Q13 {
    public static int[] [] generateScores(int n){
        int pcmmarks[][]=new int[n][3];
        Random rand= new Random();
        for(int i=0;i<n;i++){
        pcmmarks[i][0]= rand.nextInt(101);
        pcmmarks[i][1]=rand.nextInt(101);
        pcmmarks[i][2]=rand.nextInt(101);
        }
        return pcmmarks;
 }
    public static int[][] calculate(int pcmmarks[][]){
        int calculated[][]= new int[pcmmarks.length][3];
        for(int i=0;i<pcmmarks.length;i++){
            int total= (pcmmarks[i][0])+(pcmmarks[i][1])+(pcmmarks[i][2]);
            calculated[i][0]=total;
            int average= Math.round(total/3);
            calculated[i][1]=average;
            int percentage=(int) Math.round((total/300.0)*100);
            calculated[i][2]= percentage;
        }
        return calculated;
    }
    public static void Print(int calculated[][],int pcmmarks[][]){
            for(int i=0;i<calculated.length;i++){
                    System.out.printf("Score card of student %d \n score in physics %d \n score in chemistry %d \n score in maths %d \n total= %d \n average= %d \n percentage %d", i+1,pcmmarks[i][0],pcmmarks[i][1],pcmmarks[i][2],calculated[i][0], calculated[i][1], calculated[i][2]);
                }
            }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("number of students");
        int n= sc.nextInt();
        int [][]scores= generateScores(n);
        int [][]calculate= calculate(scores);
        Print(calculate, scores);





    }
}
    

