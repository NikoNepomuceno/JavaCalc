import java.util.Scanner;

public class modulus {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter base number: ");
        double base = scanner.nextDouble();

        System.out.print("Enter modulus: ");
        double modulus = scanner.nextDouble();

        double result = base % modulus;

        System.out.println(result);

        scanner.close();

    }
}
