import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n===== EXERCÍCIO 2 =====");
        final double PI = 3.14159;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduza o raio do círculo: ");
        double raio = scanner.nextDouble();

        double area = PI * raio * raio;

        System.out.printf("A área do círculo com raio %.2f é: %.2f\n", raio, area);
        scanner.close();
    }
}
