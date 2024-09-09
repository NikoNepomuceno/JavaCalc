import java.util.Scanner;
import java.lang.Math;

public class Logsub {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        double x = scanner.nextDouble();

        double result = Math.log(x) / Math.log(2);

        System.out.println(result);

        scanner.close();
    }
}
