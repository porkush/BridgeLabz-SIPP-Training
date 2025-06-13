import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter income ");
        int salary = sc.nextInt();

        int bonus = sc.nextInt();
	int income= salary + bonus;

        System.out.printf("The salary is INR %d and the bonus is INR %d, Hence Total Income is INR %d", salary, bonus, income);
    }
}
