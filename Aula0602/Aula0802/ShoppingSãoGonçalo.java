package Aula0802;

public class ShoppingSãoGonçalo extends Shopping{

    public ShoppingSãoGonçalo(String nome, int numero, String bairro, String rua, String cidade) {
        super(nome, numero, bairro, rua, cidade);
    }

    public static void main(String[] args) {
        Shopping shoppingSãoGonçalo = new Shopping("shopping SG", 0, "-", "-", "Rio de janeiro");
        shoppingSãoGonçalo.imprimirDados();
    }
}