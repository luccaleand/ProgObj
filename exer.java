import java.util.Scanner;

public class exer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome, endereco, genero, nacionalidade, profissao, DataN, rg, cnh, cpf;
        int idade;
        System.out.print("insira o nome do animal: ");
        nome = sc.nextLine();

        System.out.print("Insira a idade do animal: ");
        idade = sc.nextInt();

        sc.nextLine();

        System.out.print("Insira a endereço do animal: ");
        endereco = sc.nextLine();

        System.out.print("Insira a Data de Nascimento do animal: ");
        DataN = sc.nextLine();

        System.out.print("Insira a cpf do animal: ");
        cpf = sc.nextLine();

        System.out.print("Insira a rg do animal: ");
        rg = sc.nextLine();

        System.out.print("Insira a cnh do animal: ");
        cnh = sc.nextLine();

        System.out.print("Insira o genero do animal: ");
        genero = sc.nextLine();

        System.out.print("Insira o nacionalidade do animal: ");
        nacionalidade = sc.nextLine();

        System.out.print("Insira o profissão do animal: ");
        profissao = sc.nextLine();

        System.out.print("\nNome: " + nome + "\nIdade: " + idade + "\nEndereço: " + endereco + "\nData de Nascimento: "
                + DataN + "\ncpf: " + cpf + "\nrg: " + rg + "\ncnh: " + cnh + "\ngenero: " + genero
                + "\nnacionalidade: " + nacionalidade + "\nArea atuante: " + profissao);

    }
}