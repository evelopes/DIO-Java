import java.util.Scanner;

public class MetrosEmCentimetros {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de metros: ");
        double metros = sc.nextDouble();
        double centimetros = metros * 100;
        System.out.println(centimetros);

    }
}
