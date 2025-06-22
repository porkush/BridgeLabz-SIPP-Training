package Methods;

import java.util.Scanner;

public class Q6 {
    public double[] calculateTrignometricFunctions(double angle){
        double radians= Math.toRadians(angle);
        double sine= Math.sin(radians);
        double cosine= Math.cos(radians);
        double tan = Math.tan(radians);
        return new double[] {radians,sine,cosine,tan};
    } 

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double angle= sc.nextDouble();
        Q6 obj= new Q6();
        double arr[]= obj.calculateTrignometricFunctions(angle);
        double radians= arr[0];
        double sine= arr[1];
        double cosine= arr[2];
        double tan = arr[3];
        System.out.println("radians" + radians  + "\n sine" + sine + "\n cosine" + cosine + "\n tan" + tan);

    }
    
}
