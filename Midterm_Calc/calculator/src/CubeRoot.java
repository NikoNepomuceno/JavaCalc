import java.util.Scanner;
import java.lang.Math;

public class CubeRoot {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        double CubeRoot = Math.cbrt(number);

        System.out.println(CubeRoot);

        scanner.close();

    }
}
