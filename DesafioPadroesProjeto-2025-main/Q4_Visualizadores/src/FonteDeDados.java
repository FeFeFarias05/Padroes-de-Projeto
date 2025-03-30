import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FonteDeDados{
    private List<Integer> lst;
    private List<Observador> observadores;

    public FonteDeDados(){
        lst = new LinkedList<>();
        observadores = new ArrayList<>();
    }

    public void add(Integer value){
        if (value < 0) throw new IllegalArgumentException("Valor invalido");
        lst.add(value);
        notificarObservadores();
    }

    public void addObservador(Observador o) {
        observadores.add(o);
    }

    public void removerObservador(Observador o) {
        observadores.remove(o);
    }

    public void notificarObservadores() {
        for (Observador o : observadores) {
            o.atualizar(new ArrayList<>(lst));
        }
    }

}