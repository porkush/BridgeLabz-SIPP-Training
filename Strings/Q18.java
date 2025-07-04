package strings;

import java.util.Scanner;

public class Q18 {

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

    public static String[] splitWords(String input) {
        String[] words = new String[100]; 
        String word = "";
        int index = 0;

        for (int i = 0; i < getLength(input); i++) {
            char ch = input.charAt(i);
            if (ch != ' ') {
                word += ch;
            } else {
                if (!word.equals("")) {
                    words[index++] = word;
                    word = "";
                }
            }
        }

        if (!word.equals("")) {
            words[index++] = word;
        }

        String[] trimmed = new String[index];
        for (int i = 0; i < index; i++) {
            trimmed[i] = words[i];
        }
        return trimmed;
    }

    public static String[][] wordWithLength(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getLength(words[i])); // convert int to string
        }

        return result;
    }

    public static void displayTable(String[][] wordData) {
        System.out.println("\nWord\t\tLength");
        System.out.println("------------------------");

        for (int i = 0; i < wordData.length; i++) {
            String word = wordData[i][0];
            int length = Integer.parseInt(wordData[i][1]); 
            System.out.println(word + "\t\t" + length);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a line of text:");
        String input = sc.nextLine();

        String[] words = splitWords(input);
        String[][] wordInfo = wordWithLength(words);

        displayTable(wordInfo);
    }
}

