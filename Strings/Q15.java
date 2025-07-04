package strings;

import java.util.Scanner;

public class Q15 {
    public static int getLength(String input){
        int count = 0;
        try {
            while (true) {
                input.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    public static String[] Split(String input){
        String word = "";
        String words[] = new String[100];
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

        String[] finalWords = new String[index];
        for (int i = 0; i < index; i++) {
            finalWords[i] = words[i];
        }

        return finalWords;
    }

    public static String[][] wordLength(String[] words){
        String[][] wordlen = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            wordlen[i][0] = words[i];
            wordlen[i][1] = String.valueOf(getLength(words[i]));
        }
        return wordlen;
    }

    public static String[] shortLong(String[][] wordlen){
        int minVal = Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;
        int minIndex = 0, maxIndex = 0;

        for (int i = 0; i < wordlen.length; i++) {
            int len = Integer.parseInt(wordlen[i][1]);
            if (len < minVal) {
                minVal = len;
                minIndex = i;
            }
            if (len > maxVal) {
                maxVal = len;
                maxIndex = i;
            }
        }

        return new String[] { wordlen[minIndex][0], wordlen[maxIndex][0] };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String input = sc.nextLine();

        String[] words = Split(input);
        System.out.println("Words:");
        for (String ele : words) {
            System.out.println(ele);
        }

        String[][] wordlen = wordLength(words);
        String[] shortlong = shortLong(wordlen);

        System.out.println("Shortest Word: " + shortlong[0]);
        System.out.println("Longest Word: " + shortlong[1]);
    }
}

