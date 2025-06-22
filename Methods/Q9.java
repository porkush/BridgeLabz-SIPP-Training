package Methods;

import java.util.Scanner;

public class Q9 {
    public int checkNumber(int num) {
        if (num > 0) return 1;
        else if (num < 0) return -1;
        else return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Q9 obj = new Q9();
        int result = obj.checkNumber(num);
        System.out.println("Result: " + result);
    }
}

