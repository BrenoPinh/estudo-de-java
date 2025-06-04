package vetor02;

public class Vetor02 {
    public static void main(String[] args) {
        String mês[] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro" , "Outubro", "Novembro", "Dezembro"};

        int numDias[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int c = 0; c<mês.length; c++) {
            System.out.println("O mês de " + mês[c] + " tem " + numDias[c] + " dias!");
        };
    }
}
