package tipotriangulo;

import java.util.Scanner;

public class TipoTriangulo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Primeiro lado do triângulo

        int pl;

        //Segundo lado do triângulo

        int sl;


        //Terceiro lado do triângulo

        int tl;

        //Tipo do triângulo

        String triângulo = null;

        //Perguntas

        System.out.println("Qual o valor do primeiro lado?");
        pl = teclado.nextInt();

        System.out.println("Qual o valor do segundo lado?");
        sl = teclado.nextInt();

        System.out.println("Qual o valor do terceiro lado?");
        tl = teclado.nextInt();
        if (pl <= 0 || sl <= 0 || tl<= 0){
            System.out.println("Não é possível formar um triângulo com essas medidas.");
        } else{
            if (pl == sl && sl == tl) {
                triângulo = "Equilátero";
                } else if (pl == sl || sl == tl || pl == tl) {
                    triângulo = "Isóceles";
                } else if (pl != sl && sl != tl) {
                    triângulo = "Escaleno";
                }
                System.out.println(triângulo);
            } 
        }
}
