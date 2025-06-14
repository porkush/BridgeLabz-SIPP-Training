import java.util.Scanner;

class Q10{
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    int odd[]= new int[n];
    int even[]= new int[n];
    int indodd=0;
    int inteve=0;
    for(int i=1;i<=n;i++){
    if(i%2==0){
        even[inteve++]=i;
    }
    else{
        odd[indodd++]=i;
    }
    }
    System.out.print("even");
    for(int i=0;i<inteve;i++){
        System.out.print(even[i] + " ");
    }
    System.out.print("odd ");
       for(int i=0;i<indodd;i++){
        System.out.print(odd[i] + " ");
    }

    }
}