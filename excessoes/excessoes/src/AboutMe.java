import java.util.Locale;
import java.util.Scanner;
import java.util.InputMismatchException;


public class AboutMe {
    public static void main(String[] args) {

        try{
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu nome:");
        String nome = sc.nextLine();

        System.out.println("Digite seu sobrenome:");
        String sobrenome = sc.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = sc.nextDouble();

        System.out.println("Olá me chamo "+ nome.toUpperCase() + " " + sobrenome.toUpperCase());
        System.out.println("Tenho "+ idade + " anos");
        System.out.println("Minha altura é " + altura + "cm");
        sc.close();
        }
        catch (InputMismatchException e) {
            System.err.println("ERRO: a idade ou altura precisam ter valores numéricos!");
            
        }

    

    }
}
