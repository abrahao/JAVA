// Neste desafio, receba um número inteiro N,
// calcule e imprima o somatório de todos os números de N até 0.

import java.util.*;

public class Desafio03 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int numero = leitor.nextInt();

        System.out.println(somatorio(numero));

    }


    static int somatorio(int numero) {
        if (numero == 0) {
            return 0;
        } else {
            return numero + somatorio(numero - 1);
        }
    }
}