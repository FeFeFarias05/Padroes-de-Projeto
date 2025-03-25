public class Codificador {
    private CodificadorStrategy strategy;

    public Codificador(CodificadorStrategy estrategia) {
        this.strategy = strategy;
    }

    public void setEstrategia(CodificadorStrategy strategy) {
        this.strategy = strategy;
    }

    public String codifica(String str) {
        return strategy.codifica(str);
    }

    public String deCodifica(String str) {
        return strategy.deCodifica(str);
    }
}
