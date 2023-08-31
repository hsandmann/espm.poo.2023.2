package aula04;

import aula03.Cliente;
import aula03.Conta;
import aula03.PessoaFisica;

public class MainObject {
    
    public static void main(String[] args) {


        Cliente c1 = new PessoaFisica("Carlos Rafael");
        Cliente c2 = new PessoaFisica("Carlos Rafael");

        System.out.println(c1);
        System.out.println(c2);

        System.out.println(c1.equals(c2));

        Conta conta1 = new Conta(c1);
        System.out.println(conta1);
    }

}
