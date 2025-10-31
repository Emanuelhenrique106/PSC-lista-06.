// Atividade6.java
import java.util.Scanner;
public class Atividade6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] medias = new double[10];
        System.out.println("Atividade 6: Digite 4 notas para cada um dos 10 alunos:");
        for (int i = 0; i < 10; i++) {
            double soma = 0;
            System.out.println("Aluno " + (i+1) + ":");
            for (int j = 0; j < 4; j++) {
                System.out.print("  Nota " + (j+1) + ": ");
                soma += sc.nextDouble();
            }
            medias[i] = soma / 4.0;
        }
        int contador = 0;
        System.out.println("Médias dos alunos:");
        for (int i = 0; i < medias.length; i++) {
            System.out.printf("Aluno %d: %.2f%n", i+1, medias[i]);
            if (medias[i] >= 7.0) contador++;
        }
        System.out.println("Quantidade de alunos com média >= 7.0: " + contador);
        sc.close();
    }
}