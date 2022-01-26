public class ExceptionBoleto extends Exception{
    @Override
    public String getMessage() {
        return "Boleto inválido";
    }
}
