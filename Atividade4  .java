// Atividade4.java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Atividade4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] v = new char[10];
        System.out.println("Atividade 4: Digite 10 caracteres (pressione Enter após cada):");
        for (int i = 0; i < 10; i++) {
            System.out.print("Char " + (i+1) + ": ");
            String s = sc.nextLine().trim();
            while (s.isEmpty()) { System.out.print("Digite um caractere: "); s = sc.nextLine().trim(); }
            v[i] = s.charAt(0);
        }
        List<Character> consoantes = new ArrayList<>();
        for (char c : v) {
            char ch = Character.toLowerCase(c);
            if (Character.isLetter(ch) && "aeiou".indexOf(ch) == -1) consoantes.add(c);
        }
        System.out.println("Quantidade de consoantes: " + consoantes.size());
        System.out.print("Consoantes: ");
        for (char c : consoantes) System.out.print(c + " ");
        System.out.println();
        sc.close();
    }
}