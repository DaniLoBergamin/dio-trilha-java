public class Operadores {
    

    public static void main(String[] args) {
        
        String nomeCompleto = "LINGUAGEM" + "JAVA";
        System.out.println(nomeCompleto);

        // -----------------------------------------------------------------------------------
        
        // x Repetição
        
        int numero = 5;
        // numero = numero + 1;    // é a mesma coisa que numero++
        //numero = numero + 1;
        System.out.println(++ numero);  // para decrementar, trocar o símbolo para --
        System.out.println(numero);

        // -----------------------------------------------------------------------------------
        
        // BOOLEAN - inverter
        boolean variavel = true;
        variavel = !variavel;

        System.out.println(variavel);   // OUTPUT = false

        // -----------------------------------------------------------------------------------

        // TERNÁRIO
        int a, b;
        a = 5;
        b = 6;

        // EXPRESSÃO BOOLEAN
        String resultado = a == b ? "verdadeiro" : "falso";
        int resultadoInt = a == b ? 1 : 0;

        System.out.println(resultado);
        System.out.println(resultadoInt);

        // -----------------------------------------------------------------------------------

        // RELACIONAIS
        int numero1 = 1;
        int numero2 = 2;
        boolean simNao = numero1 == numero2;

        if(numero1 < numero2){
            System.out.println("A nossa condição é verdadeira");
        }      

        System.out.println("numeroUm é igual a numeroDois? " + simNao);
            simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente do numeroDois? " + simNao);
            simNao = numero1 > numero2;

        if(numero1 < numero2){
            System.out.println("As nossas condições são verdadeiras");
        }  

        // ------------------------------------------------------------------------------------
        
        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && (7 > 4)){
            System.out.println("As duas condições são verdadeiras");
        }  

        if(condicao1 || condicao2){
            System.out.println("A nossa condição é verdadeira");
        }  
    }
}
