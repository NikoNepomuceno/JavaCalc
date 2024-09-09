import java.lang.Math;
import java.util.Scanner;

public class TWOexponential {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter base number: ");
        double base = scanner.nextInt();

        System.out.println("Enter exponent: ");
        double exponent = scanner.nextInt();

        System.out.println("Enter 2nd exponent: ");
        double ex2 = scanner.nextInt();

        double exp = Math.pow(exponent, ex2);
        double result = Math.pow(base, exp);

        System.out.println(result);

        scanner.close();

    }
}
