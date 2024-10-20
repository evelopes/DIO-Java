//Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].

import java.util.Scanner;

public class EX2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int numero = scan.nextInt();

        System.out.println(String.format("O número informado foi %s", numero ));
        scan.close();
    }
}
