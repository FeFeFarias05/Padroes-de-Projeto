public class ItemDeVenda {
    private Item item;
    private int quantidade;

    public ItemDeVenda(Item item, int quantidade) {
        this.item = item;
        this.quantidade = quantidade;
    }

    public Item getItem() {
        return item;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getSubTotal() {
        return item.getPreco() * quantidade;
    }

    @Override
    public String toString() {
        return String.format("%s x%d: %.2f%n", item.getNome(), quantidade, getSubTotal());
    }
}