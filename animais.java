import java.util.Scanner;

public class animais {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String cor, raca, nome;
        double tamanho;

        System.out.print("insira o nome do animal: ");
        nome = sc.nextLine();

        System.out.print("Insira a cor do animal: ");
        cor = sc.nextLine();

        System.out.print("Insira a raça do animal: ");
        raca = sc.nextLine();
    
        System.out.print("Insira o tamanho do animal: ");
        tamanho = sc.nextDouble();

        System.out.print("\nNome: "  + nome + "\nCor: "+ cor + "\nRaça:"+ raca+ "\nTamanho: " + tamanho+ " M\n");
    
    }
}
