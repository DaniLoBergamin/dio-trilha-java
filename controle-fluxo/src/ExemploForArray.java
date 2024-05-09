public class ExemploForArray {
    public static void main(String[] args) {
        String alunos [] = {"FELIPE", "JONAS", "JULIA", "MARCOS", "ANA"};

        // Em ARRAYS, o índice do elemento inicia em ZERO
        for(int x=0; x<alunos.length; x++){
            System.out.println("O aluno no índice x=" + x + " é " + alunos[x]);
        }
    }
}

/* Outro exemplo:

    public class ExemploForArray {
    public static void main(String[] args) {
        String alunos [] = {"FELIPE", "JONAS", "JULIA", "MARCOS", "ANA"};

        for(String aluno : alunos){
            System.out.println("O nome do aluno é: " + aluno);
        }
    }
}

 */
