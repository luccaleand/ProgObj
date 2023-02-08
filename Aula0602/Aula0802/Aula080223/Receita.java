package Aula0802.Aula080223;

public class Receita {
    private String nome;
    private String tipo;
    private double duração;
    private String nacionalidade;

    public Receita(String nome, String tipo, double duração, String nacionalidade)
    {
        this.nome = nome;
        this.tipo = tipo;
        this.duração = duração;
        this.nacionalidade = nacionalidade;
    }

    public void imprimirDados() { // método imprimirDados()
        System.out.println("Nome:  " + nome + "\ntipo:  " + tipo + "\nduração:  " + duração + "\nnacionalidade:  " + nacionalidade+ "\n--------------------------------------------");
    }

    public static void main(String[] args) {
        Shopping shoppingRJ = new Shopping("shopping Rio", 0, "-", "-", "Rio de janeiro");
        Shopping shoppingNiteroi = new Shopping("shopping Niteroi", 8, "Centro", "Quinze de Novembro", "Niterói");
        Shopping shoppingSãoGonçalo = new Shopping("Shopping São Gonçalo", 0, "-", "-", "Niteroi");
        shoppingRJ.imprimirDados();
        shoppingNiteroi.imprimirDados();
        shoppingSãoGonçalo.imprimirDados();
    }
}}
