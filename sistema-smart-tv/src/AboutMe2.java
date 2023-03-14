import java.util.Scanner;
import java.util.Locale;

public class AboutMe2 {

    
 
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Digite o seu nome:");
            String nome = scanner.next();

            System.out.println("Digite o seu sobrenome:");
            String sobrenome = scanner.next();

            System.out.println("Digite a sua idade:");
            int idade = scanner.nextInt();

            System.out.println("Digite a sua altura:");
            double altura = scanner.nextDouble();
            
      /*  String nome = args [0];
            String sobrenome = args [1];
            int idade = Integer.valueOf(args[2]);
            double altura = Double.valueOf(args[3]);*/
   
            System.out.println("Ola, me chamo " + nome + " " + sobrenome);
            System.out.println("Tenho " + idade + " anos");
            System.out.println("Minha altura é " + altura + " metros");
        }
    }
}
