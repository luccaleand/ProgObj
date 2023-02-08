package Aula0802;

public class ShoppingNiteroi extends Shopping {

    public ShoppingNiteroi(String nome, int numero, String bairro, String rua, String cidade) {
        super(nome, numero, bairro, rua, cidade);
    }

    public static void main(String[] args) {
        Shopping shoppingNiteroi = new ShoppingNiteroi("shopping Niteroi", 0, "-", "-", "Rio de janeiro");
        shoppingNiteroi.imprimirDados();
    }
}