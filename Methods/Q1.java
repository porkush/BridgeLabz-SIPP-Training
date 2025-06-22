package Methods;

import java.util.Scanner;

public class Q1 {
    public static double windCHill(double temp, double windSpeed){
        double windChill= 35.74 + (0.6215* temp) + (0.4275 *temp - 35.75) * Math.pow(windSpeed,0.16);
        return windChill;
    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter temp & windspeed");
        double temp= sc.nextDouble();
        double windSpeed= sc.nextDouble();
        System.out.println(windCHill(temp, windSpeed));
    }
}
