package Methods;

import java.util.Scanner;

public class Q11 {
    public boolean checkSpring(int day, int month){
        if((day >=20 && month==3) || (day <=20 && month ==4)){
            return true;
        }
        return false; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter day & month");
        int day = sc.nextInt();
        int month= sc.nextInt();
        Q11 tem= new Q11();
        System.out.println(tem.checkSpring(day,month));
    }
}
