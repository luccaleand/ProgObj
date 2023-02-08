//o sistema apresenta o numero limte e um numero escolhido nesse limite.

import java.util.Random;
import java.util.Scanner;

public class NumeroLimite {
    public static void main(String[] args) {
        {
            Scanner ler = new Scanner(System.in);
            int limitenumero, numero;

            Random random = new Random();
            System.out.print("Insira um numero:");
            limitenumero = ler.nextInt();
            numero = random.nextInt((limitenumero));
            System.out.print("O numero aleatorio é " +numero);
            
            /* 
             * numero = ler.nextInt();
             * System.out.print("\nPrimeiro numero: " + Pnum);
             * System.out.print("\nSegundo numero: " + SAnum);
             * 
             * if (PAnum > SAnum) {
             * System.out.print("\nCalculo automático: O MAIOR NUMERO É: " + PAnum);
             * } else {
             * System.out.print("\nCalculo automático: O MAIOR NUMERO É:" + SAnum);
             * }
             * 
             */
        }
    }
}

/*
 * System.out.print("Insira um numero: ");
 * System.out.print("\nO quadrado desse numero é " + Pnum);
 * sc.close();
 * }
 * }
 * 
 * import java.util.Random;
 * public class quadradoDoValor {
 * public static void main(String[] args) {
 * 
 * Random random = new Random();
 * 
 * int numeroInteiroAleatorio_0_a_10 = random.nextInt(10);
 * System.out.println("Número inteiro aleatório de 0 até 10: " +
 * numeroInteiroAleatorio_0_a_10);
 * 
 * double numeroRealAleatorio_0_a_1 = random.nextDouble();
 * System.out.println("Número real aleatório de 0 até 1: " +
 * numeroRealAleatorio_0_a_1);
 * 
 * double numeroRealAleatorio_0_a_10 = random.nextDouble() * 10;
 * System.out.println("Número real aleatório de 0 até 10: " +
 * numeroRealAleatorio_0_a_10);
 * 
 * }
 * 
 * }
 */
