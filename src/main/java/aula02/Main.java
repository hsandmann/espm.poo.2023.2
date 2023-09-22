package aula02;

import aula03.BancoException;
import aula03.Conta;
import aula03.ContaCorrente;

public class Main {
    public static void main(String[] args) {

        Conta c = new ContaCorrente(null);

        try {
            c.sacar(0);
        } catch (BancoException e) {
            e.printStackTrace();
        }
    }
}
