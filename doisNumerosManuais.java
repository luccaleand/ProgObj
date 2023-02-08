import java.util.Scanner;

public class doisNumerosManuais {
    public static void main(String[] args) {
        {
            Scanner ler = new Scanner(System.in);
            int Pnum, Snum;

            System.out.print("Insira o primeiro numero: ");
            Pnum = ler.nextInt();
            System.out.print("Insira o segundo numero: ");
            Snum = ler.nextInt();

            if (Pnum > Snum) {
                System.out.print("\nO MAIOR NUMERO É: " + Pnum);
            } else {
                System.out.print("\nO MAIOR NUMERO É:" + Snum);
            }
        }
    }
}
            
