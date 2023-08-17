package aula02;

public class Conta {

    String agencia;
    String numero;

    double saldo;
    double limite;

    public double sacar(double valor) {
        saldo = saldo - valor;
        return saldo;
    }

    public double depositar(double valor) {
        saldo += valor;
        return saldo;
    }

    public double getSaldo() {
        return saldo;
    }
    
}
