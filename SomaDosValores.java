import java.util.Scanner;

public class SomaDosValores {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int Pnum, Snum, Tnum, total;

        System.out.print("Insira um numero:");
        Pnum = sc.nextInt();

        System.out.print("Insira um numero:");
        Snum = sc.nextInt();

        System.out.print("Insira um numero:");
        Tnum = sc.nextInt();

        total = Pnum + Snum + Tnum;

        System.out.print("\nPrimeiro Numero: " + Pnum + "\nSegundo Numero: " + Snum + "\nTerceiro Numero: " + Tnum
                + "\nValor total: " + total);
        sc.close();
    }
}