import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        double saldo = 42.0;
        System.out.println("Qual valor gostaria de sacar? ex: 15,8");
        double valorSolicidado = sc.nextDouble();
        if(valorSolicidado<= saldo){
            saldo = saldo - valorSolicidado;
            System.out.println(String.format("Saldo atualizado para R$%.2f", saldo));
        }else{
            System.out.println("Saldo insuficiente");
        }

    }
}
