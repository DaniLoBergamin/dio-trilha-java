public class ExemploBreakContinue {
    public static void main(String[] args) {
        for(int numero = 1; numero <=5; numero ++){
            if(numero == 3)
                continue;

                System.out.println(numero); // OUTPUT: 1 2 4 5
        }                                   
    }
}


/* Utilizando BREAK - OUTPUT: 1 2
 
public class ExemploBreakContinue {
    public static void main(String[] args) {
        for(int numero = 1; numero <=5; numero ++){
            if(numero == 3)
                continue;

                System.out.println(numero);
        }
    }
}
 */