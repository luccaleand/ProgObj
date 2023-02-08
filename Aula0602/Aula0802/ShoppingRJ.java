package Aula0802;

public class ShoppingRJ extends Shopping{
    public ShoppingRJ(String nome, int numero, String bairro, String rua, String cidade) {
        super(nome, numero, bairro, rua, cidade);
    }

    public static void main(String[] args) {
        Shopping shoppingRJ = new ShoppingRJ("shopping Rio", 0, "a", "a", "Rio de janeiro");
        shoppingRJ.imprimirDados();
    }
}
