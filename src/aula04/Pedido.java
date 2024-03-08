package aula04;
//A ideia é melhorar esse codigo, aplicando os conceitos de solid
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    List<Item> itens = new ArrayList<>();
    double valorTotal = 0.0;
    public void adicionarItem(String nome, double preco) {
        this.itens.add(new Item(nome,preco));
        this.valorTotal += preco;
    }
    public void imprimirRecibo() {
        for (Item item : itens) {
            System.out.println(item.nome + ": " + item.preco);
        }
        System.out.println("Total: " + valorTotal);
    }
    class Item {
        String nome;
        double preco;
        Item(String nome, double preco) {
            this.nome = nome;
            this.preco = preco;
        }
    }
}
