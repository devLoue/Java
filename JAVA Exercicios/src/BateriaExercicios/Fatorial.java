package BateriaExercicios;
import java.util.Scanner;
public class Fatorial {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int n = leitor.nextInt();
        long fatorial = 1;
        for (int i =1; i <= n; i++){
            System.out.println(fatorial);
            fatorial = fatorial * i;
            System.out.println(fatorial);
        }
        System.out.println(fatorial);
    }
}