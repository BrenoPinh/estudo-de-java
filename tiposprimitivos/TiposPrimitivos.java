package tiposprimitivos;

import java.util.Scanner;

public class TiposPrimitivos {
    public static void main(String[] args) {
        //float nota = 8.5f;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do aluno:");
        String nome = teclado.nextLine();
        System.out.println("Digite a nota do aluno:");
        float nota = teclado.nextFloat();
        //sout -> System.out
        //System.out.printf("A sua nota é: %.1f \n", nota);
        System.out.format("A nota de %s é %.1f \n", nome, nota);
    }
}