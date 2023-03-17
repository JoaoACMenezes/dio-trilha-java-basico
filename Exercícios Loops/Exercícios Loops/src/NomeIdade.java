/*Faça um programa que leia doi valores , o primeiro é o nome e o 
 * segundo a idade do aluno. (Pare o programa inserindo o valor 0 no campo nome.)
  */
import java.util.Scanner;

public class NomeIdade {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        

        while (true) {
            System.out.println("Nome: ");
        nome = scan.next();
        if (nome.equals("0")) break;

        System.out.println("Idade: ");
        idade = scan.nextInt();
        } 

        System.out.println("Continua aqui...");
    }
}
