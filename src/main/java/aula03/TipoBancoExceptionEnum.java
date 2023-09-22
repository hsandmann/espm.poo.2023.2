package aula03;

public enum TipoBancoExceptionEnum {
    
    SALDO_INSUFICIENTE(90),
    DEPOSITO_NEGATIVO_OU_ZERO(43),
    SAQUE_NEGATIVO_OU_ZERO(44);

    public final int codigo;

    private TipoBancoExceptionEnum(int codigo) {
        this.codigo = codigo;
    }

}
