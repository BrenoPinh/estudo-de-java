package contadorjava;

import java.util.Scanner;

public class ContadorJava {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escolha um número como limite de contagem:");
        int numero = teclado.nextInt();
        int contagem = 0;

        while (contagem < numero) {
            contagem++;
            System.out.println(contagem);
            if (contagem == 100){
                break;
            }
        }
    }
}
