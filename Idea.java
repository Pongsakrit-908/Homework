import java.util.Scanner;
public class Idea {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
    System.out.print("Enter num1 = ");
      int num1 = scanner.nextInt();
    System.out.print("Enter num2 = ");
      int num2= scanner.nextInt();

      int add=num1+num2;
      int subtract=num1-num2;
      int multiply=num1*num2;
      double divide = (double) num1 / num2;


System.out.println("Add is = "+add);
System.out.println("Subtract is = "+subtract);
System.out.println("Multiply is = "+multiply);
System.out.printf("Divide is = %.2f\n", divide);
    }
}