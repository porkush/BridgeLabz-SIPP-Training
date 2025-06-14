import java.util.*;
public class Q9 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        String arr[]=new String[num];
        for(int i=0;i<num;i++){
        int n=i+1;
        if(n>0 && n%3==0 && n%5==0){
                arr[i]="fizzBuzz";
            }
        else if(n>0 && n%3==0 ){
                arr[i]="Fizz";
            }

        else if(n>0 && n%5==0 ){
                arr[i]="Buzz";
            }
        
        else if(n>0){
                arr[i]=String.valueOf(n);
            }
        }
    for(String ele:arr){
        System.out.println(ele);
    }
}
}
