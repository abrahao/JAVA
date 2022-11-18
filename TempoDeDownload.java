// Faça um programa que peça o tamanho de um arquivo para 
// download (em MB) e a velocidade de um link de Internet (em Mbps). 
// Calcule e informe o tempo aproximado de download do 
// arquivo usando este link (em minutos). 

import java.util.Scanner;

public class TempoDeDownload {

  public static void main(String[] Args) {

   Scanner sc = new Scanner(System.in);
   double tmhMB = sc.nextFloat();
   double tmhMbps = sc.nextFloat();
   double tempoSegundos = tmhMB / tmhMbps;
   double tempoMinutos = tempoSegundos / 60;

    System.out.printf("%.2f", tempoMinutos);
    
    }
}