import java.lang.Math;
import java.util.Scanner;

public class Ceilling {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = scanner.nextDouble();

        double ceilling = Math.ceil(num);

        System.out.println(ceilling);

        scanner.close();

    }
}
