import java.util.Scanner;

public class ContaTerminal {
    // Atributos
    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    // Método para inserir os dados no terminal
    @SuppressWarnings("resource")
    public void inserirDadosViaTerminal() {
        Scanner scanner = new Scanner(System.in);

        // Solicitar e receber o número da agência
        System.out.println("Por favor, digite o número da Agência:");
        this.agencia = scanner.nextLine();

        // Solicitar e receber o número da conta
        System.out.println("Por favor, digite o número da Conta:");
        this.numero = scanner.nextInt();
        scanner.nextLine(); // Consumir o caractere de nova linha após o nextInt()

        // Solicitar e receber o nome do cliente
        System.out.println("Por favor, digite o nome do Cliente:");
        this.nomeCliente = scanner.nextLine();

        // Solicitar e receber o saldo
        System.out.println("Por favor, digite o saldo:");
        this.saldo = scanner.nextDouble();
    }

    // Método para exibir a mensagem após inserir os dados
    public void exibirMensagem() {
        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }

    // Método principal (main) para teste
    public static void main(String[] args) {
        // Criar um objeto ContaTerminal
        ContaTerminal conta = new ContaTerminal();

        // Inserir os dados via terminal
        conta.inserirDadosViaTerminal();

        // Exibir a mensagem
        conta.exibirMensagem();
    }
}
