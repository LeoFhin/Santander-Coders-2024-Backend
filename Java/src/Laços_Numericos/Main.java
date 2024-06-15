package Laços_Numericos;

public class Main {
    public static void main(String[] args) {

        // 1 2 3 4 5 6 7 8 9 10
        // Para uma variável que incia em 1 e vai até 10, mudando 1 por 1, faça: (calculadora)

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + "X" + j + "=" + j * i);
            }
        }
    }
}

