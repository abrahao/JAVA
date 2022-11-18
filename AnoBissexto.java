import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner ent = new Scanner(System.in);
        int ano;
    
        ano = ent.nextInt();

        if ((ano % 4 == 0) && (ano % 100 != 0 || ano % 400 == 0)) {
            System.out.println(ano);
        } 
        else {
            System.out.println("Nao eh bissexto");
        }
    }
}