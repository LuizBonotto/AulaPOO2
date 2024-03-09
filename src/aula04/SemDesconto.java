package aula04;

import java.util.List;

public class SemDesconto extends Pedido implements Descontos {
    public double calcularValorDesconto (List<Item> itens){
        double valorTotal = 0.0;
        for (Pedido.Item item : itens) {
            valorTotal += item.preco;
        }
        return valorTotal;
    }

}