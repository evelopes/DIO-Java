import java.util.Scanner;
//Faça um Programa que peça dois números e imprima a soma.
public class Soma {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número");
        int primeiroNumero = scan.nextInt();
        System.out.println("Digite outro número");
        int segundoNumero = scan.nextInt();

        int soma = primeiroNumero + segundoNumero;
        System.out.println(String.format("A soma de %s com %s é: %s", primeiroNumero, segundoNumero, soma));
        scan.close();
    };
}
