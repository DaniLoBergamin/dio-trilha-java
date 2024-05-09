import java.util.Locale;
import java.util.Scanner;
import java.util.InputMismatchException;

public class AboutMeTryCatch {
    public static void main(String[] args) {
        try{    
            // Criando o objeto scanner
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    
            System.out.println("Digite seu nome:");
            String nome = scanner.next();
    
            System.out.println("Digite seu sobrenome:");
            String sobrenome = scanner.next();
    
            System.out.println("Digite sua idade:");
            int idade = scanner.nextInt();
    
            System.out.println("Digite sua altura:");
            double altura = scanner.nextDouble();
    
            // Imprimindo os dados obtidos pelo usuário
            System.out.println("Olá! Me chamo " + nome.toUpperCase() + " " + sobrenome);
            System.out.println("Tenho " + idade + " anos ");
            System.out.println("Minha altura é " + altura + " cm ");
            scanner.close();
            }
            catch (InputMismatchException e){
                System.out.println("O campo idade e altura precisam ser numéricos");
            }
    }
}


