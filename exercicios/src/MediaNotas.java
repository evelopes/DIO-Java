import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        // Criação do Scanner para entrada de dados
        Scanner sc = new Scanner(System.in);

        System.out.println("Vamos calcular a sua média bimestral!");

        // Coletando as 4 notas
        System.out.println("Digite a primeira nota:");
        double nota1 = sc.nextDouble();

        System.out.println("Digite a segunda nota:");
        double nota2 = sc.nextDouble();

        System.out.println("Digite a terceira nota:");
        double nota3 = sc.nextDouble();

        System.out.println("Digite a quarta nota:");
        double nota4 = sc.nextDouble();

        // Calculando a média
        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        // Exibindo a média com duas casas decimais
        System.out.printf("A média das suas notas é: %.2f%n", media);

        // Fechando o Scanner
        sc.close();
    }
}
