public abstract class DadoDecorator implements Decorador {
    protected Dado dado;

    public DadoDecorator(Dado dado) {
        this.dado = dado;
    }

    @Override
    public void rolar() {
        dado.rolar();
    }

    @Override
    public int getValor() {
        return dado.getValor();
    }
}
