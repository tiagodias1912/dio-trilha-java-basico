import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("\nDigite seu nome");
        String nome = scanner.next();
        
        System.out.println("\nDigite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("\nDigite sua idade");
        int idade = scanner.nextInt();
        
        System.out.println("\nDigite sua altura");
        double altura = scanner.nextDouble();

        
        //imprimindo os dados obtidos pelo usuario
        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
        
        
    }
}
