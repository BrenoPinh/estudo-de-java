package operadorternário;

public class OperadorTernário {
    public static void main(String[] args) {
        int n1 = (int) 25;
        int n2 = (int) 20;
        int maior = (int) 0;

        maior = n1>n2?n1:n2;

        System.out.println(maior);
    }
}
