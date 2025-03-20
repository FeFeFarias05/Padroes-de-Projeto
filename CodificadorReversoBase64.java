import java.time.LocalDate;
import java.util.Base64;


public class CodificadorReversoBase64 implements Codificador {
    public String getNome() {
        return "Codificador Reverso Base64";
    }
    
    public LocalDate getDataCriacao() {
        return LocalDate.of(2025, 3, 19);
    }
    
    public int getNivelSeguranca() {
        return 30;
    }
    
    public String codifica(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return Base64.getEncoder().encodeToString(reversed.getBytes());
    }
    
    public String decodifica(String str) {
        byte[] decodedBytes = Base64.getDecoder().decode(str);
        String reversed = new String(decodedBytes);
        return new StringBuilder(reversed).reverse().toString();
    }
}