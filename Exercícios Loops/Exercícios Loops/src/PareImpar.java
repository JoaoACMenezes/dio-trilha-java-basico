import java.util.Scanner;

/*Faça um programa que peça N números inteiros,
 * calcule e mostre a quantidade de números pares e a 
 * quantidade de números impares.
 */

public class PareImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int quantPares = 0;
        int quantImpares = 0;

        System.out.println("Quantidade de números: ");
        quantNumeros = scan.nextInt();

        int count = 0;
        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0 ) quantPares++;
            else quantImpares++;


            count++;/*é a mesma coisa que count = count + 1 */
            
        } while (count < quantNumeros);
        System.out.println("A quantidade de números pares é: " + quantPares);
        System.out.println("A quantidade de números ímpares é: " + quantImpares);
    }
}
