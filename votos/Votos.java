package votos;

import java.util.Scanner;

public class Votos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int anoAtual = 2025;
        
        System.out.println("Em qual ano você nasceu?");
        int nasc = teclado.nextInt();
        int idade = anoAtual- nasc;

        if (idade < 16) {
            System.out.println("Você tem " + idade + " anos e não pode votar!");
            
        } else  if(idade < 18 || idade >= 70){
            System.out.println("Você tem " + idade + " anos e tem voto opcional!");
        } else {
            System.out.println("Você tem " + idade + " anos e tem voto obrigatório!");
        }

    }
}
