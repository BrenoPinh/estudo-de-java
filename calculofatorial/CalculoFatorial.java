package calculofatorial;

import java.util.Scanner;

public class CalculoFatorial {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escolha um número como base para o fatorial:");
        int num = teclado.nextInt();
        int cf = num;
        int valor = 1;
        
        while (cf>1){
            valor = cf*valor;
            cf--;
            System.out.print(cf + "*");
        }  
        System.out.println(": O valor do fatorial ao lado é: " + valor);
    }
}
