package exerciciobaskara;

import java.util.Scanner;

public class ExercicioBhaskara {
    public static void main(String[] args) {
        //DELTA = B^2 - 4*A*C

        Scanner teclado = new Scanner(System.in);
        System.out.println("Escolha o valor de A:");

        double A = teclado.nextDouble();

        System.out.println("Escolha o valor de B:");

        double B = teclado.nextDouble();    

        System.out.println("Escolha o valor de C:");

        double C = teclado.nextDouble();

        double delta = (Math.pow(B, 2) - (4*A*C));

        System.out.println("O valor de delta é: " + delta);

        //BHASKARA =  (-B +- DELTA)/2*A

        if (delta<0) {
            System.out.println("Não há raízes reais.");
        } else {
        //Positivo
        double bhaskara = (-B + Math.sqrt(delta))/(2*A);
        //Negativo
        double bhaskara2= (-B - Math.sqrt(delta))/(2*A);
        System.out.println("As raízes do resultado do cálculo de bhaskara são: " + bhaskara + " e " + bhaskara2);
        }
    }
}