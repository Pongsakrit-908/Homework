import java.util.Scanner;

public class Cat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length: ");
        int length = scanner.nextInt();

        System.out.print("Enter long: ");
        int l = scanner.nextInt();

        int area = l * length;

        System.out.println("Rectangle area is: " + area);
    }
}