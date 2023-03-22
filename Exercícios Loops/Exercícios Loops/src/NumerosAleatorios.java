import java.util.Random;

/*Faça um programaque leia 20 números aleatórios (entre 0 e 100) e
 * armazene-os num vetor.
 * Ao final, mostre os números e seus sucessores.
 */


public class NumerosAleatorios {
    public static void main(String[] args) {
       Random random = new Random();
       
       int[] numerosAleatorios = new int[20];

       for (int i = 0; i < numerosAleatorios.length; i++) {
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
       }
       System.out.print("\nAntecessor dos números Aleatórios: ");
       for (int numero : numerosAleatorios) {
        System.out.print((numero-1) + " ");         
      }
       System.out.print("\nNúmeros Aleatórios: ");
       for (int numero : numerosAleatorios) {
        System.out.print(numero + " ");}
        
        System.out.print("\nSucessor dos números Aleatórios: ");
        for (int numero : numerosAleatorios) {
         System.out.print((numero+1) + " ");         
       }

      
    }
}

