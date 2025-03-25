public class App {
    public static void main(String[] args) {
        LogSingleton log = LogSingleton.getInstancia();
        log.log("Mensagem de alerta 1");
        log.log("Mensagem de alarme 23");
        log.log("Mensagem de PANICO!!");

        for (String mensagem : log) {
            System.out.println(mensagem);
        }

        LogSingleton logS = LogSingleton.getInstancia();
        logS.log("Nova mensagem de alerta");
        
        System.out.println("logs");
        for (String mensagem : log) {
            System.out.println(mensagem);
        }
    }
}
