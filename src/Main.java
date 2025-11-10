import java.util.Scanner;
void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("\n===== EXERCÍCIO 1 =====");
    int soma = 0;

    System.out.println("Introduza 5 números inteiros:");
    for (int i = 1; i <= 5; i++) {
        int numero = scanner.nextInt();
        soma += numero;
    }

    System.out.println("A soma dos 5 números é: " + soma);
    scanner.close();
}
