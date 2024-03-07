import java.util.Scanner;

public class Main {
    static String fibo(int n) {
        int atual = 0;
        int anterior = 0;
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                atual = 1;
                anterior = 0;
            } else {
                atual += anterior;
                anterior = atual - anterior;
            }
        }
        return atual + ", ";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("DIGITE UM NÚMERO INTEIRO PARA CALCULO DA SEQUÊNCIA DE FIBONACCI: ");
        int numero = scanner.nextInt();

        for (int i = 0; i < numero; i++) {
            System.out.print( Main.fibo(i));
        }
    }
}
