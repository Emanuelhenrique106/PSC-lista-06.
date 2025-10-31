// Atividade3.java
import java.util.Scanner;
public class Atividade3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[4];
        System.out.println("Atividade 3: Digite 4 notas:");
        double soma = 0;
        for (int i = 0; i < 4; i++) {
            System.out.print("Nota " + (i+1) + ": ");
            notas[i] = sc.nextDouble();
            soma += notas[i];
        }
        System.out.print("Notas: ");
        for (double n : notas) System.out.print(n + " ");
        double media = soma / 4.0;
        System.out.println("\nMédia: " + media);
        sc.close();
    }
}