import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da Conta: ");
        int numero = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite o número da Agência: ");
        String agencia = sc.next();

        System.out.println("Digite o nome do Cliente: ");
        String nomeCliente = sc.next();

        System.out.println("Digite o Saldo: ");
        double saldo = sc.nextDouble();

        System.out.println(
                "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                        + ", conta " + numero + " e seu saldo R$" + saldo + " já está disponível para saque.");
    }
}
