// Atividade2.java
import java.util.Scanner;
public class Atividade2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] v = new double[10];
        System.out.println("Atividade 2: Digite 10 números reais:");
        for (int i = 0; i < v.length; i++) {
            System.out.print("v[" + i + "]: ");
            v[i] = sc.nextDouble();
        }
        System.out.println("Ordem inversa:");
        for (int i = v.length - 1; i >= 0; i--) System.out.println(v[i]);
        sc.close();
    }
}