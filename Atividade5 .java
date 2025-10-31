// Atividade5.java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Atividade5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] todos = new int[20];
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();
        System.out.println("Atividade 5: Digite 20 inteiros:");
        for (int i = 0; i < 20; i++) {
            System.out.print("num[" + i + "]: ");
            todos[i] = sc.nextInt();
            if (todos[i] % 2 == 0) pares.add(todos[i]);
            else impares.add(todos[i]);
        }
        System.out.print("Todos: ");
        for (int n : todos) System.out.print(n + " ");
        System.out.println("\nPares: " + pares);
        System.out.println("Ímpares: " + impares);
        sc.close();
    }
}