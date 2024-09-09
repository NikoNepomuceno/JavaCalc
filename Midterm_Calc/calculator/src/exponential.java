import java.lang.Math;
import java.util.Scanner;

public class exponential {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter base number: ");
        double base = scanner.nextInt();

        System.out.println("Enter exponent: ");
        double exponent = scanner.nextInt();

        double exp = Math.pow(base, exponent);

        System.out.println(exp);

        scanner.close();
    }
}
