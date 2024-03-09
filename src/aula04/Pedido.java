package aula04;
//A ideia é melhorar esse codigo, aplicando os conceitos de solid
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    List<Item> itens = new ArrayList<>();
    public void adicionarItem(String nome, double preco) {
        this.itens.add(new Item(nome, preco));
    }
    public double calcularValorTotal() {

    }

    class Item  {
        String nome;
        double preco;
        Item(String nome, double preco) {
            this.nome = nome;
            this.preco = preco;
        }
    }
}
