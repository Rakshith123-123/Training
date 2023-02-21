
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
