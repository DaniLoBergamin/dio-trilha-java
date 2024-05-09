public class ResultadoEscolar {
    public static void main(String[] args){
        int nota = 4;
        
        // Condicional Simples
        if(nota >= 7)
            System.out.println("Aprovado");

        // Condicional Encadeada
        else if(nota >= 5 && nota < 7)
        System.out.println("Prova de Recuperação");

        else
            System.out.println("Reprovado");
    }
}


// CONDIÇÃO TERNÁRIA - CÓDIGO MAIS LIMPO

/*  public class ResultadoEscolar {
        public static void main(String[] args){
                int nota = 7;

                String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
                
                System.out.println(resultado);
            }
        }
         
*/