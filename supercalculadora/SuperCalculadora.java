package supercalculadora;

import java.util.Scanner;

public class SuperCalculadora {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o número que deseja obter os cálculos:");
        double numero = (double) teclado.nextDouble();
        double restDiv = (double) numero%2;
        double cub = (double) Math.pow(numero,3);
        double rQuad = (double) Math.sqrt(numero);
        double rCub = (double) Math.cbrt(numero);
        double absoluto = (double) Math.abs(numero);
        System.out.println("Resto da Divisão por 2: " + restDiv);
        System.out.println("Elevado ao Cubo: " + cub);
        System.out.println("Raiz Quadrada: " + String.format("%.3f",rQuad));
        System.out.println("Raiz cúbica: " + String.format("%.3f",rCub)) ;
        System.out.println("Valor absoluto: " + absoluto);
    }
}
