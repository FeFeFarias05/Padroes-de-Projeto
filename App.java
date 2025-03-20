public class App {
    public static void main(String[] args) throws Exception {
        Codificador cod = new CodificadorSimples();

        System.out.println("Codificador: "+cod.getNome());
        System.out.println("Versao: "+cod.getDataCriacao());
        System.out.println("Nivel de segurança: "+cod.getNivelSeguranca());
        
        String texto = "Este e o string a ser codificado";
        String codificado = cod.codifica(texto);
        String decodificado = cod.decodifica(codificado);

        System.out.println("Texto original: "+texto);
        System.out.println("Texto codificado: "+codificado);
        System.out.println("Texto decodificado: "+decodificado);

        Codificador codBase64 = new CodificadorReversoBase64();

        String textoRev = "Este e o string a ser codificado reverso";
        System.out.println("\nCodificador: " + codBase64.getNome());
        System.out.println("Versao: " + codBase64.getDataCriacao());
        System.out.println("Nivel de segurança: " + codBase64.getNivelSeguranca());
        
        String codificadoBase64 = codBase64.codifica(textoRev);
        String decodificadoBase64 = codBase64.decodifica(codificadoBase64);

        System.out.println("Texto original: " + textoRev);
        System.out.println("Texto codificado (Base64): " + codificadoBase64);
        System.out.println("Texto decodificado (Base64): " + decodificadoBase64);
    }
}
