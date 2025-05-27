package leitordepensamento;

import java.util.Scanner;

public class LeitorDePensamento {
    public static void main(String[] args) {
        int numero = (int) (1 + Math.random() * (6-1));
        System.out.println(numero);
        System.out.println("Estou pensando em um número entre 1 e 5. Tente adivinhar! :");

        Scanner teclado = new Scanner(System.in);
        int palpite = teclado.nextInt();

        String resultado = (palpite == numero)?"Acertou!":"Errou!";
        System.out.println(resultado);
    }
}
