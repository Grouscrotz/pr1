import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double firstOperand = scanner.nextDouble();

        System.out.print("Введите операцию (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        System.out.print("Введите второе число: ");
        double secondOperand = scanner.nextDouble();

        double result = 0;
        boolean isOperationValid = true;

        switch (operation) {
            case '+':
                result = firstOperand + secondOperand;
                break;
            case '-':
                result = firstOperand - secondOperand;
                break;
            case '*':
                result = firstOperand * secondOperand;
                break;
            case '/':
                if (secondOperand == 0) {
                    System.out.println("Ошибка: деление на ноль невозможно.");
                    isOperationValid = false;
                } else {
                    result = firstOperand / secondOperand;
                }
                break;
            default:
                System.out.println("Ошибка: неподдерживаемая операция.");
                isOperationValid = false;
                break;
        }

        if (isOperationValid) {
            System.out.println("Результат: " + result);
        }

        scanner.close();
    }
}