package programapernas;

import java.util.Scanner;

public class ProgramaPernas{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Fale uma quantidade de pernas e determinaremos o tipo do ser:");
        int pernas = teclado.nextInt();

        String tipo;
        
        switch (pernas) {
            case 0:
                tipo = "célula";
                break;
            case 1:
                tipo = "saci";
                break;
            case 2:
                tipo = "bípede";
                break;
            case 4,6:
                tipo = "aranha"; 
                break;
            default:
                tipo = "ET";
        }
        System.out.println("Pela quantidade de pernas esse ser é um(a): " + tipo);
    }
}