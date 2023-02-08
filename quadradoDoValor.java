//Informe um valor e retorno será o quadrado desse número.

import java.util.Random;
import java.util.Scanner;

public class quadradoDoValor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int Pnum, Snum, Tnum, Qnum, QQnum;

        Random random = new Random();
        int Num = random.nextInt(100);
        System.out.print("Insira um numero: ");
        Num = sc.nextInt();

        Pnum = (Num * Num);



        System.out.print("\nO quadrado desse numero automatica é " +Num);
        System.out.print("\nO quadrado desse numero é " +Pnum);
        sc.close();
    }
}


                                                            // A FAZER


/*
import java.util.Random;
public class quadradoDoValor {
    public static void main(String[] args) {

        Random random = new Random();

        int numeroInteiroAleatorio_0_a_10 = random.nextInt(10);
        System.out.println("Número inteiro aleatório de 0 até 10: " + numeroInteiroAleatorio_0_a_10);

        double numeroRealAleatorio_0_a_1 = random.nextDouble();
        System.out.println("Número real aleatório de 0 até 1: " + numeroRealAleatorio_0_a_1);

        double numeroRealAleatorio_0_a_10 = random.nextDouble() * 10;
        System.out.println("Número real aleatório de 0 até 10: " + numeroRealAleatorio_0_a_10);

    }

}
*/