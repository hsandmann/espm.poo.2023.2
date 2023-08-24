package aula03;

import java.util.UUID;

public class Conta {

    String id;

    Cliente cliente;
    String agencia;
    String numero;

    double saldo;

    public Conta(Cliente cliente) {
        this.id = UUID.randomUUID().toString();
        this.cliente = cliente;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }

    public void depositar(double valor) {
        saldo += valor;
    }
    
}
