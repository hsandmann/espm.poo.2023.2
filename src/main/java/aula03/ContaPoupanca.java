package aula03;

public final class ContaPoupanca extends Conta implements SuportaRendimento {

    private double rendimento = 1.005;
    
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void sacar(double valor) throws BancoException {
        if (valor <= 0) throw new BancoException(TipoBancoExceptionEnum.SAQUE_NEGATIVO_OU_ZERO);
        if (valor > this.saldo) throw new BancoException(TipoBancoExceptionEnum.SALDO_INSUFICIENTE);
        this.saldo -= valor;
    }

    @Override
    public void render() {
        this.saldo *= rendimento;
    }

}
