/*Faça um programa que peça  uma nota entre zero e dez.
 * moste uma mensagem caso o valor  seja inválido e continue 
 * pedindo até que o usuário informe um valor válido. 
 */
import java.util.Scanner; /*para importar a função Scanenr */

public class Nota {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in); /*diz que vai usar a função Scanner para receber o dado do usuário */
        
        int nota; /*diz que a nota vai ser um número inteiro */

        System.out.println("Digite a nota: "); /*solicita a nota */

        nota = scan.nextInt(); /*recebe do usuário */

        while (nota < 0 | nota >10) { /*enquanto a nota for um valor inválido, continua solicitando */

           System.out.println("Nota inválida! Digite novamente: ");
           
           nota = scan.nextInt();
        }
        
        System.out.println("Obrigado!");
                          
            }
            
        }

    

