
class Calculator {
    double add(double num1, double num2) {
        return num1 + num2;
    }

    double subtract(double num1, double num2) {
        return num1 - num2;
    }

    double multiply(double num1, double num2) {
        return num1 * num2;
    }

    double divide(double num1, double num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return num1 / num2;
    }
}

public class SimpleCalculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Add
        double sum = calculator.add(3.0, 4.0);
        System.out.println("3.0 + 4.0 = " + sum);

        // Subtract
        double difference = calculator.subtract(5.0, 2.0);
        System.out.println("5.0 - 2.0 = " + difference);

        // Multiply
        double product = calculator.multiply(2.0, 6.0);
        System.out.println("2.0 * 6.0 = " + product);

        // Divide
        double quotient = calculator.divide(8.0, 2.0);
        System.out.println("8.0 / 2.0 = " + quotient);
    }
}
