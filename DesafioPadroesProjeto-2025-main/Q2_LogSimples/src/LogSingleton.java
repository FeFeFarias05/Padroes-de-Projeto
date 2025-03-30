import java.time.LocalDate;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LogSingleton implements Iterable<String> {
    private static LogSingleton unica;
    private List<String> mensagens;

    private LogSingleton() {
        mensagens = new LinkedList<>();
    }

    public static LogSingleton getInstancia() {
        if (unica == null) {
            unica = new LogSingleton();
        }
        return unica;
    }

    public void log(String m) {
        String logM = LocalDate.now() + " : " + m;
        mensagens.add(logM);
    }

    @Override
    public Iterator<String> iterator() {
        return mensagens.iterator();
    }
}

