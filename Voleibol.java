import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    // Abaixo segue um exemplo de código que você pode ou não utilizar
    public static void main(String[] args) throws IOException {
 
     //a classe Scanner auxilia na leitura dos dados de entrada
     Scanner leitor = new Scanner(System.in);

		//TODO: Complete o código com uma solução possível

    int N = leitor.nextInt();
    
    int saques = 0, bloqueios = 0, ataques = 0;
    int s1 = 0, b1 = 0, a1 = 0;
    
    for (int i = 0; i < N; i++) {
        String name = leitor.next();
        
        saques += leitor.nextInt();
        bloqueios += leitor.nextInt();
        ataques += leitor.nextInt();
        
        s1 += leitor.nextInt();
        b1 += leitor.nextInt();
        a1 += leitor.nextInt();
    }
    
    System.out.printf("Pontos de Saque: %.2f %%.\n", 100.0*s1/saques);
    System.out.printf("Pontos de Bloqueio: %.2f %%.\n", 100.0*b1/bloqueios);
    System.out.printf("Pontos de Ataque: %.2f %%.\n", 100.0*a1/ataques);
    
    leitor.close();


    }
 
}