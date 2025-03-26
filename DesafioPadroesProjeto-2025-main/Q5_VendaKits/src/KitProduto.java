import java.util.ArrayList;
import java.util.List;

public class KitProduto {
    private String nome;
    private List<Item> itens;

    public KitProduto(String nome) {
        this.nome = nome;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        double total = 0.0;
        for (Item item : itens) {
            total += item.getPreco();
        }
        return total * 0.9;
    }
}
