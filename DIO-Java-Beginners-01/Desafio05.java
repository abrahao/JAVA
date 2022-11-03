import java.util.*;

public class Desafio05 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int num = leitor.nextInt();
        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75}; 

        int cont = 0;
    
        /* Percorre o vetor até chegar no fim ou até encontrar o número no vetor. */
        while (cont < elementos.length && elementos[cont] != num)
          cont++;
        
        if (cont < elementos.length && elementos[cont] == num)
          System.out.println("Achei "+num+" na posicao "+cont);
        else /* Caso tenha percorrido todo o vetor e não encontrou o número. */
          System.out.println("Numero "+num+" nao encontrado!");
    }
}