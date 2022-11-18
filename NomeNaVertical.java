// Faça um programa que solicite o nome do usuário e 
// imprima-o de forma a mostrar o nome em formato de escada.

import java.util.*;

public class Main {
    
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String palavra = scanner.next();
        String palavra2;
        
        for(int i = 0; i <= palavra.length(); i++){
          System.out.println(palavra.substring(0,i));
        }
    }
}