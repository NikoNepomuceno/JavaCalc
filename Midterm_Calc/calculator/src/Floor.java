import java.lang.Math;
import java.util.Scanner;

public class Floor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = scanner.nextDouble();

        double Floor = Math.floor(num);

        System.out.println(Floor);

        scanner.close();

    }
}
