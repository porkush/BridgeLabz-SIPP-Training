package strings;

import java.util.Scanner;

public class Q8 {
    public static void generateException(String arr[]){
        System.out.println(arr[arr.length]);
    }
    public static void handleException(String arr[]){
        try{
            generateException(arr);
        }
        catch(Exception e){
            System.out.println("handling exception" + e.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String arr[]= new String[2];
        System.out.println("enter names");
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.next();
        }
        handleException(arr);
    }
}
