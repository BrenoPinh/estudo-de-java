package testeTipos;

public class TesteTipos {
    public static void main(String[] args) {
        /*int idade = 30;
        String idadeE = Integer.toString(idade);
        System.out.println(idadeE);

        int valor = Integer.parseInt(idadeE);
        System.out.println(valor);*/

        String valor = "30.5";
        float número = Float.parseFloat(valor);
        System.out.printf("O número é: %.1f", número);
    }
}
