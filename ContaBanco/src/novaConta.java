import java.util.Locale;
import java.util.Scanner;

public class novaConta {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Qual o seu nome?");
        String nome = scanner.nextLine();
        System.out.println("Qual saldo deseja inserir na nova conta?");
        double valorSaldo = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Em qual agencia deseja abrir a conta?");
        String nomeAgencia = scanner.nextLine();
        System.out.println("Qual o numero da conta?");
        int numeroConta = scanner.nextInt();

        System.out.println(String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nome, nomeAgencia, numeroConta, valorSaldo ));



        ContaTerminal conta = new ContaTerminal();
    }
}
