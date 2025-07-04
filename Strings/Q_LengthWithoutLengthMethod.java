package strings;

import java.util.Scanner;

public class Q_LengthWithoutLengthMethod {

    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next(); // takes input without spaces

        int manualLength = getLength(input);
        int builtinLength = input.length();

        System.out.println("Length without using length(): " + manualLength);
        System.out.println("Length using built-in length(): " + builtinLength);
    }
}
