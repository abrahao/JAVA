import java.util.Scanner;

public class Teste {
	public static void main(String[] args) throws Exception {
	  try (Scanner leitor = new Scanner(System.in)) {
        double somaDasNotas = 0;
        int contador = 0;
        
        do {
          double notaEntradaConsole = leitor.nextDouble();

          if (notaEntradaConsole < 0 || notaEntradaConsole > 10) {
            System.out.println("nota invalida");
          } else {
            contador++;
            somaDasNotas += notaEntradaConsole; 
          }
        } while (contador < 2);
        
        System.out.printf("media = " + String.format("%.2f", somaDasNotas / 2));
    }
  }
}