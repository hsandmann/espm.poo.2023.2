package aula03;

public class BancoException extends Exception {

    private final TipoBancoExceptionEnum tipo;

    public BancoException(TipoBancoExceptionEnum tipo, Throwable throwable) {
        super(throwable);
        this.tipo = tipo;
    }

    public BancoException(TipoBancoExceptionEnum tipo) {
        super();
        this.tipo = tipo;
    }

    public TipoBancoExceptionEnum getTipo() {
        return tipo;
    }
    
}
