public class ValidadorFactory {
    public static ValidadorStrategy getValidador(Validador.Tipo tipo) {
        switch (tipo) {
            case INTEIRO:
                return new ValidadorInteiro();
            case MATRICULA:
                return new ValidadorMatricula();
            case EMAIL:
                return new ValidadorEmail();
            default:
                throw new IllegalArgumentException("Tipo de validador não suportado");
        }
    }
}
