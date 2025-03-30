import java.util.ArrayList;
import java.util.List;

class VisualizadorDeMaximo implements Observador {
    private List<Integer> valores = new ArrayList<>();

    @Override
    public void atualizar(List<Integer> valores) {
        this.valores = valores;
        exibeMaximo();
    }

    public void exibeMaximo() {
        int max = valores.stream().mapToInt(Integer::intValue).max().orElse(0);
        System.out.println("Máximo: " + max + ", quantidade de elementos analisados: " + valores.size());
    }
}


