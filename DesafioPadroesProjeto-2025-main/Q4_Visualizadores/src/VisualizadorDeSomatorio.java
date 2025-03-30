import java.util.List;

public class VisualizadorDeSomatorio {
    private List<Integer> valores;

    public void atualizar(List<Integer> valores) {
        this.valores = valores;
        exibeSomatorio();
    }

    public void exibeSomatorio(){
        Integer soma = valores.stream()
            .mapToInt(Integer::intValue)
            .sum();
        System.out.println("Somatorio: "+soma+", quantidade de elementos analisados: "+valores.size());
    }
}