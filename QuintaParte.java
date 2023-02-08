//Informe um valor e retorne a quanta parte deste valor
import java.util.Scanner;

public class QuintaParte {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int Num, Pnum, Snum, Tnum, Qnum, QQnum;

        System.out.print("Insira um numero:");
        Num = sc.nextInt();

        Pnum = Num /1;
        Snum = Num /2;
        Tnum = Num /3;
        Qnum = Num /4;
        QQnum = Num /5;

        System.out.print("\nA quinta parte de "+Num+ " é " + QQnum + " \n\nPois a primeira parte é " +Pnum+" \nE a segunda parte é "+Snum+" \nA terceira parte é " +Tnum+ " \nE a quarta parte é " +Qnum+ " \nE a quinta é " +QQnum);
        sc.close();
    }
}



