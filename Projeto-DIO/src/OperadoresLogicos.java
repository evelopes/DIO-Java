public class OperadoresLogicos {
    public static void main(String[] args) {
        Integer numero = 1;
        Integer numeroDois = 3;

       
        String verdadeiro  = numeroDois >= numero && numero == numeroDois ? "Verdadeiro" : "falso";

        

        System.out.println(verdadeiro);
        System.out.println(numero.equals(numeroDois));

    }
}
