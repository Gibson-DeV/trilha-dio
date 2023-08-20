import java.util.Scanner;

/**
 * @author Gibson Cruz da Silva
 * @version 1.0
 */

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        Double saldo = 2000.00;

        System.out.println("Por favor, insira o número da agência: ");
        agencia = scanner.next();

        System.out.println("Insira o numero da conta: ");
        numero = scanner.nextInt();

        System.out.println("Informe o nome: ");
        nomeCliente = scanner.next();
        scanner.close();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência" +
                " é: " + agencia + ", e seu saldo " + saldo + " já está disponível parea saque.");

    }
}