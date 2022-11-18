// Supondo que a população de um país A tenha N habitantes com uma
//  taxa anual de crescimento de 3% e que a população de B M habitantes 
//  com uma taxa de crescimento de 1.5%. Faça um programa que calcule e 
//  escreva o número de anos necessários para que a população do país A 
//  ultrapasse ou iguale a população do país B, mantidas as taxas de crescimento.
// Obs: O valor inicial da população A deverá ser sempre menor que do país B

import java.util.Scanner;

public class TaxaDeCrescimento {
    public static void main(String[] args) {
        double A, B;

        Scanner input = new Scanner(System.in);
        A = input.nextInt();
        B = input.nextInt();
               

        int anos = 0;
        
        while (A < B){
          A += (A * 3 / 100);
          B += (B * 1.5 / 100);
          anos++;
        }

        System.out.println(anos + " anos");
    }
}