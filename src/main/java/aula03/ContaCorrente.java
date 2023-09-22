package aula03;

public final class ContaCorrente extends Conta implements SuportaRendimento {

    private double limite = 100;
    private double juros = 1.01;

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void sacar(double valor) throws BancoException {
        if (valor <= 0) throw new BancoException(TipoBancoExceptionEnum.SAQUE_NEGATIVO_OU_ZERO);
        if (valor > this.saldo + this.limite) throw new BancoException(TipoBancoExceptionEnum.SALDO_INSUFICIENTE);
        this.saldo -= valor;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public void render() {
        if (saldo < limite) this.saldo *= this.juros;
    }
    
}
