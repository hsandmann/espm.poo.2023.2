package aula03;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    String nome;

    List<Conta> contas;
    List<Cliente> clientes;

    // Construtor da classe Banco
    public Banco(String nome) {
        // this eh uma referencia do proprio objeto na memoria.
        this.contas = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.nome = nome;
    }

}
