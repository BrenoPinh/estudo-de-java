package comparaçãostring;

public class ComparaçãoString {
    public static void main(String[] args){
        String nome1 = "Breno";
        String nome2 = "Breno";
        String nome3 = new String("Breno");
        String res;
        res = (nome1==nome3)?"igual":"diferente";
        System.out.println(res);
    }
}
