// Atividade7.java
import java.util.Scanner;
public class Atividade7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[5];
        System.out.println("Atividade 7: Digite 5 inteiros:");
        long soma = 0;
        long prod = 1;
        for (int i = 0; i < v.length; i++) {
            System.out.print("v[" + i + "]: ");
            v[i] = sc.nextInt();
            soma += v[i];
            prod *= v[i];
        }
        System.out.print("Números: ");
        for (int n : v) System.out.print(n + " ");
        System.out.println("\nSoma: " + soma);
        System.out.println("Multiplicação (produto): " + prod);
        sc.close();
    }
}