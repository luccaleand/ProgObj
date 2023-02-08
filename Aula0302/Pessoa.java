package Aula0302;

public class Pessoa { // classe
    private String nome;// atributos, prorpiedades
    private int idade;// atributos, prorpiedades
    private Double altura;// atributos, prorpiedades

}
    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;

}
public void imprimirDados(){
    System.out.print("nome "+nome+ " altura "+altura+" idade "+ idade);
}

public void saudacao(){
    System.out.print("olá, meu nome é "+nome+" tenho "+ idade+" anos");
};
