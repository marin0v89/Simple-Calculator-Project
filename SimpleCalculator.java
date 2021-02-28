import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double firstNumber;
        double secondNumber;
        String operand;

        System.out.println("Please enter first number :");
        firstNumber = Double.parseDouble(scan.nextLine());
        System.out.println("Please enter second number :");
        secondNumber = Double.parseDouble(scan.nextLine());
        System.out.println("Please choose an operand (+ , - , * ,/ ,power) :");
        operand = scan.nextLine();

        printResult(firstNumber, secondNumber, operand);
    }

    private static void printResult(double firstNumber, double secondNumber, String operand) {
        switch (operand.toLowerCase()) {
            case "+":
                double result = firstNumber + secondNumber;
                System.out.println(String.format("%f + %f = %.2f", firstNumber, secondNumber, result));
                break;
            case "-":
                result = firstNumber - secondNumber;
                System.out.println(String.format("%f - %f = %.2f", firstNumber, secondNumber, result));
                break;
            case "*":
                result = firstNumber * secondNumber;
                System.out.println(String.format("%f * %f = %.2f", firstNumber, secondNumber, result));
                break;
            case "/":
                result = firstNumber / secondNumber;
                System.out.println(String.format("%f * %f = %.2f", firstNumber, secondNumber, result));
                break;
            case "power":
                result = Math.pow(firstNumber,secondNumber);
                System.out.println(String.format("%f power %f = %.2f", firstNumber, secondNumber, result));
                break;
            default:
                throw new IllegalStateException("Unknown operand.");
        }
    }
}
