import java.util.Scanner;

public class ControleSimplesDeSaques {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        double limiteDiario = scanner.nextDouble();
        double saque  = 0;
        // TO DO: Crie um loop 'for' para iterar sobre os saques:
        for (double valorSaque  = saque; limiteDiario >valorSaque ;limiteDiario-=valorSaque){
            // TO DO: Solicite ao usuário o valor do saque:
            saque = scanner.nextDouble();

            // TO DO: Verifique se o valor do saque é zero, encerrando as transações:
            // Dica: Utilize um 'if/else' para verificar as condições do valorSaque e o limiteDiario;
            if (saque == 0) {
                System.out.println("Transacoes encerradas.");
                return;
            }else {

                // TO DO: Se o valor do saque não ultrapassar o limite diário, subtraia o valor do saque do limite diário:
                if (saque <= limiteDiario) {
                    limiteDiario -= saque;
                    System.out.println("Saque realizado. Limite restante: " + String.format("%.1f", limiteDiario));
                } else {

                    // TO DO: Informe que o saque foi realizado e mostre o limite restante:
                    System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                    return;
                }
            }
        }

        // Fechamos o Scanner para evitar vazamento de recursos:
        scanner.close();
    }
}
