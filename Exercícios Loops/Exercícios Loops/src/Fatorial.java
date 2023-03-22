import java.util.Scanner;

/*Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
 * Ex: 5!= 120 (5x4x3x2x1 = 120)
 */


public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

         
        System.out.println("fatorial: ");
        int fatorial = scan.nextInt();

        int multiplicacao = 1;

        System.out.println(fatorial +"! = ");
       for (int j = fatorial ; j >= 1; j--) {
            multiplicacao = multiplicacao * j;
       }
        System.out.println(multiplicacao);
    }   
        
}
