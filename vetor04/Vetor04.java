package vetor04;

import java.util.Arrays;

public class Vetor04 {
    public static void main(String[] args) {
        int vet[] = {6, 4, 1, 6, 10, 8, 3, 6};
        Arrays.sort(vet);
        int p = Arrays.binarySearch(vet, 3);
        System.out.println(p);
    }
}
