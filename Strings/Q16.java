package strings;

import java.util.Scanner;

public class Q16 {

    public static int getLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    public static int[] getSpaceIndexes(String s) {
        int count = 0;

        for (int i = 0; i < getLength(s); i++) {
            if (s.charAt(i) == ' ' && (i == 0 || s.charAt(i - 1) != ' ')) {
                count++;
            }
        }

        int[] spaceIndexes = new int[count];
        int index = 0;

        for (int i = 0; i < getLength(s); i++) {
            if (s.charAt(i) == ' ' && (i == 0 || s.charAt(i - 1) != ' ')) {
                spaceIndexes[index++] = i;
            }
        }

        return spaceIndexes;
    }

    public static String[] customSplit(String s) {
        int len = getLength(s);
        String[] temp = new String[100];
        int index = 0;
        String word = "";

        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                word += ch;
            } else {
                if (!word.equals("")) {
                    temp[index++] = word;
                    word = "";
                }
            }
        }

        if (!word.equals("")) {
            temp[index++] = word;
        }

        String[] finalWords = new String[index];
        for (int i = 0; i < index; i++) {
            finalWords[i] = temp[i];
        }

        return finalWords;
    }

    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String input = sc.nextLine();

        String[] custom = customSplit(input);
        String[] builtIn = input.trim().split("\\s+"); // handles multiple spaces

        System.out.println("\nCustom Split:");
        for (String word : custom) {
            System.out.println(word);
        }

        System.out.println("\nBuilt-in Split:");
        for (String word : builtIn) {
            System.out.println(word);
        }

        boolean areEqual = compareArrays(custom, builtIn);
        System.out.println("\nAre both arrays equal? " + areEqual);
    }
}
 {
    
}
