public class Metodos {
    public static void somar(int num, int num2){
        int valor = num + num2;
        System.out.println(valor);
    }       

    public static void subtrair(int num, int num2){
        int valor = num - num2;
        System.out.println(valor);
    }       

    public static void dividir(int num, int num2){
        int valor = num / num2;
        System.out.println(valor);
    }       

    public static void multiplicar(int num, int num2){
        int valor = num * num2;
        System.out.println(valor);
    }       

    public static void main(String[] args) {
        somar(55,6);
        subtrair(55,6);
    }
}
