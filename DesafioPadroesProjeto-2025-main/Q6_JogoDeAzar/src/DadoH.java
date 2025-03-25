import java.util.*;

public class DadoComHistorico extends DadoDecorator {
    private List<Integer> historico;

    public DadoComHistorico(Dado dado) {
        super(dado);
        this.historico = new ArrayList<>();
    }

    @Override
    public void rolar() {
        super.rolar();
        historico.add(getValor()); // Armazenar o valor de cada jogada
    }

    // Método para obter o histórico de jogadas
    public List<Integer> getHistorico() {
        return historico;
    }
}
