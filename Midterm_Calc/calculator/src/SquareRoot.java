import java.util.Scanner;
import java.lang.Math;

public class SquareRoot {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        double squareRoot = Math.sqrt(number);

        System.out.println(squareRoot);

        scanner.close();

    }
}
