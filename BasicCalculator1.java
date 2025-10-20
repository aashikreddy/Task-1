import java.util.*;
public class BasicCalculator1 {
    //Method for addition
    public static double add(double a, double b) { return a + b; }
    //Method for substraction
    public static double subtract(double a, double b) { return a - b; }
    //Method for multiplication
    public static double multiply(double a, double b) { return a * b; }
    //Method for division
    public static double divide(double a, double b) {
        if (b == 0) throw new ArithmeticException("Division by zero is not allowed");
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b;
        int choice;
        do {
            System.out.println("\n--- Basic Calculator ---");
            System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            if (choice == 0) break;
            System.out.print("Enter first number: ");
            a = scanner.nextDouble();
            System.out.print("Enter second number: ");
            b = scanner.nextDouble();

            switch (choice) {
                case 1 -> System.out.println("Result: " + add(a, b));
                case 2 -> System.out.println("Result: " + subtract(a, b));
                case 3 -> System.out.println("Result: " + multiply(a, b));
                case 4 -> {
                    try {
                        System.out.println("Result: " + divide(a, b));
                    } catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                    }
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        System.out.println("Exiting Calculator. Goodbye!");
        scanner.close();
    }
}
