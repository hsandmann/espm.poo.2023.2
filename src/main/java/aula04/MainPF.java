package aula04;

import aula03.BancoException;
import aula03.Cliente;
import aula03.Conta;
import aula03.ContaCorrente;
import aula03.PessoaFisica;

public class MainPF {

    public static void main(String[] args) throws BancoException {
        PessoaFisica pf1 = new PessoaFisica("123.123.123-23");
        pf1.setNome("Carlos Rafael");

        Conta c1 = new ContaCorrente(pf1);
        c1.sacar(10);

        Cliente pf2 = new PessoaFisica("123.123.123-23");

    }
    
}
