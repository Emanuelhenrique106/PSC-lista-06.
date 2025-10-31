// Atividade1.java
import java.util.Scanner;
public class Atividade1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[5];
        System.out.println("Atividade 1: Digite 5 inteiros:");
        for (int i = 0; i < v.length; i++) {
            System.out.print("v[" + i + "]: ");
            v[i] = sc.nextInt();
        }
        System.out.print("Vetor lido: ");
        for (int x : v) System.out.print(x + " ");
        System.out.println();
        sc.close();
    }
}