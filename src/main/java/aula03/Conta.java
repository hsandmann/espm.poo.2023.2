package aula03;

import java.util.UUID;

public class Conta {

    protected String id;

    protected Cliente cliente;
    protected String agencia;
    protected String numero;

    private double saldo;

    public Conta(Cliente cliente) {
        this.id = UUID.randomUUID().toString();
        this.cliente = cliente;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }

    public void depositar(double valor) throws BancoException {
        if (valor <= 0) {
            throw new BancoException(TipoBancoExceptionEnum.DEPOSITO_NEGATIVO_OU_ZERO);
        }
        saldo += valor;
    }

    @Override
    public String toString() {
        return id + " -> " + cliente;
    }

    public double getSaldo() {
        return saldo;
    }
    
}
