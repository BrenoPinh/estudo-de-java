package vetor03;

import java.util.Arrays;

public class Vetor03 {
    public static void main(String[] args) {
        double v[] = {1, 2, 3, 4.5, 4.3, 1.2, 0.3};
        Arrays.sort(v);;
        for (double valor: v) {
            System.out.println(valor);
        };
    };
}

