import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Conta! ");
        int numeroConta = sc.nextInt();

        System.out.println("Por favor, digite o número da Agência! ");
        String agencia = sc.next();

        System.out.println("Por favor, digite o seu nome! ");
        String nomeCliente = sc.next();

        System.out.println("Por favor, digite o seu saldo! ");
        double saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numeroConta + " e R$ " + saldo
                + " já está disponível para saque.");

        sc.close();
    }
}
