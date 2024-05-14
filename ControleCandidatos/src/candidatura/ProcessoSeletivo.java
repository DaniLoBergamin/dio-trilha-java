package candidatura;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String [] candidatos = {"MARCIA", "JULIA", "MONICA", "MIRELA", "DANIELA"};
        for(String candidato: candidatos){
            entrandoEmContato(candidato);
        }
    }
    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do{
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("Contato realizado com sucesso!");
        
        }while(continuarTentando && tentativasRealizadas < 3);

        if(atendeu)
            System.out.println("Conseguimos contato com " + candidato + " na tentativa " + tentativasRealizadas);
        else
            System.out.println("Não conseguimos contato com " + candidato + ", nº máximo de tentativas " + tentativasRealizadas + " realizada.");
    
    }

    // Método auxiliar
    static boolean atender(){
        return new Random().nextInt(3)==1;
        
    }

    static void imprimirCandidatos(){
        String [] candidatos = {"MARCIA", "JULIA", "MONICA", "MIRELA", "DANIELA"};
        System.out.println("Imprimindo a lista de candidatos, informando o índice do elemento");
    
        for(int indice = 0; indice < candidatos.length; indice++){
            System.out.println("O candidato de nº " + (indice+1) + " é " + candidatos[indice]);
        }
        
        System.out.println("Forma abreviada de interação - FOR EACH");

        for(String candidato: candidatos){
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }
    
    static void selecaoCandidatos(){
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JOÃO"};
            
        int candidatosSelecionados = 0;
        int candidatosAtuais = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatosAtuais < candidatos.length) {
            String candidato = candidatos[candidatosAtuais];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou esse valor de salário " + salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatosAtuais++;
        }       
    }  
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }   

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato");
        }else if (salarioBase == salarioPretendido)
            System.out.println("Ligar para o candidato com Contra Proposta");
        else{
            System.out.println("Aguardando o resultado dos demais candidatos");
        }
    }
}
