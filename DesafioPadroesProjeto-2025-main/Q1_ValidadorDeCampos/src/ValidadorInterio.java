public class ValidadorInterio implements Validador{
    @Override
    public valida(String valor){
         for(int i=0;i<valor.length();i++){
            if (!Character.isDigit(valor.charAt(i))){
                return false;
            }
        }
            return true;
    }
}