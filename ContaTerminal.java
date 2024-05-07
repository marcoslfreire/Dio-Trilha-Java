import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaração das variáveis
        int numero; // Número da conta (inteiro)
        String agencia; // Número da agência (texto)
        String nomeCliente; // Nome do cliente (texto)
        double saldo; // Saldo da conta (decimal)

        // Solicita e recebe o número da agência
        System.out.println("Por favor, digite o número da Agência:");
        agencia = scanner.nextLine();

        // Solicita e recebe o número da conta
        System.out.println("Por favor, digite o número da Conta:");
        numero = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer do teclado

        // Solicita e recebe o nome do cliente
        System.out.println("Por favor, digite o nome do Cliente:");
        nomeCliente = scanner.nextLine();

        // Solicita e recebe o saldo da conta
        System.out.println("Por favor, digite o saldo da Conta:");
        saldo = scanner.nextDouble();

        // Exibe a mensagem com os dados inseridos pelo usuário
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +
                agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}

