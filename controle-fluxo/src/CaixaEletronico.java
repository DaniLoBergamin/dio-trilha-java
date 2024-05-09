public class CaixaEletronico {
    public static void main(String[] args){
        double saldo = 25.0;
        double valorSolicitado = 20.0;

        // Condicional Simples não teria o else. O sistema retornaria apenas uma resposta. O código seria finalizado apenas com o if.

        // Condicional Simples
        if(valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
            System.out.println("Novo saldo "+ saldo);

        // Condicional Composta
        }else
            System.out.println("Saldo insuficiente");
    }
}
