package aula03;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;

    private List<Conta> contas;
    private List<Cliente> clientes;

    // Construtor da classe Banco
    public Banco(String nome) {
        // this eh uma referencia do proprio objeto na memoria.
        this.contas = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void calcularRendimentos() {
        contas.forEach(c -> {
            if (c instanceof SuportaRendimento cr) cr.render();
        });
    }

}
