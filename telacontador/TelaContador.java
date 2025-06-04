package telacontador;

import java.util.Scanner;

public class TelaContador {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escolha um número de início:");

        int numI = teclado.nextInt();

        System.out.println("Escolha um número de fim:");

        int numF = teclado.nextInt();

        System.out.println("Escolha o passo entre os números:");

        int numP = teclado.nextInt();

        for(int c= numI; c<=numF; c+=numP){
            System.out.println(c);
        };
    }
}
