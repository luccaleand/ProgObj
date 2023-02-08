import java.util.Scanner;

public class Média {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int Pnum, Snum, Tnum, media;

        System.out.print("Insira o primeiro numero:");
        Pnum = sc.nextInt();

        System.out.print("Insira o segundo numero:");
        Snum = sc.nextInt();

        System.out.print("Insira o terceiro numero:");
        Tnum = sc.nextInt();

        media = (Pnum + Snum + Tnum) /3;

        System.out.print("\nPrimeiro Numero: " + Pnum + "\nSegundo Numero: " + Snum + "\nTerceiro Numero: " + Tnum
                + "\nValor da Média : " + media);
        sc.close();
    }
}