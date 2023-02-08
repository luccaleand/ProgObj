//Informe dois valores e monstre o maior valor de forma automatica.

import java.util.Random;

public class doisNumeros {
    public static void main(String[] args) {
        Random random = new Random();
        int PAnum = random.nextInt(100);
        int SAnum = random.nextInt(100);
        System.out.print("\nPrimeiro numero: " + PAnum);
        System.out.print("\nSegundo numero: " + SAnum);
        if (PAnum > SAnum) {
            System.out.print( "\nCalculo automático: O MAIOR NUMERO É: " + PAnum);
        } else {
            System.out.print("\nCalculo automático: O MAIOR NUMERO É:" + SAnum);
        }
    }
}