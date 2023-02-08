package Aula0802;

public class Shopping {
    public String nome;
    public String bairro;
    public String rua;
    public String cidade;
    public int numero;

    // método constructor -> PRA CRIAR OU EXCLUIR OBJETOS
    public Shopping(String nome, int numero, String bairro, String rua, String cidade) {
        this.nome = nome;
        this.cidade = cidade;
        this.bairro = bairro;
        this.numero = numero;
        this.rua = rua;
    }

    public void imprimirDados() { // método imprimirDados()
        System.out.println("Nome:  " + nome + "\ncidade:  " + cidade + "\nbairro:  " + bairro + "\nrua:  " + rua +  "\nnumero:  " + numero + "\n--------------------------------------------");
    }

    public static void main(String[] args) {
        Shopping shoppingRJ = new Shopping("shopping Rio", 0, "-", "-", "Rio de janeiro");
        Shopping shoppingNiteroi = new Shopping("shopping Niteroi", 8, "Centro","Quinze de Novembro", "Niterói");
        Shopping shoppingSãoGonçalo = new Shopping("Shopping São Gonçalo", 0, "-", "-", "Niteroi");
        shoppingRJ.imprimirDados();
        shoppingNiteroi.imprimirDados();
        shoppingSãoGonçalo.imprimirDados();
    }
}
