import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Basic Calculator!");
        System.out.println("Available operations: +, -, *, /");
        System.out.print("Enter an expression (e.g., '5 + 10'): ");

        try {
            String input = scanner.nextLine();

            // Split the input into parts
            String[] parts = input.split(" ");
            if (parts.length != 3) {
                throw new IllegalArgumentException("Invalid input format. Please use 'number operator number'.");
            }

            double num1 = Double.parseDouble(parts[0]);
            String operator = parts[1];
            double num2 = Double.parseDouble(parts[2]);

            double result;

            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 == 0) {
                        throw new ArithmeticException("Division by zero is not allowed.");
                    }
                    result = num1 / num2;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid operator. Use +, -, *, or /.");
            }

            System.out.println("Result: " + result);
        } catch (NumberFormatException e) {
            System.err.println("Invalid number format. Please enter valid numbers.");
        } catch (IllegalArgumentException | ArithmeticException e) {
            System.err.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
