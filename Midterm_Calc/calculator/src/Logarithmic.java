import java.util.Scanner;
import java.lang.Math;

public class Logarithmic {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        double result = Math.log(number);

        System.out.println(result);

        scanner.close();
    }
}
