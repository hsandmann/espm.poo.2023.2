package aula03;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public abstract class Cliente {

    protected String id;
    protected String nome;
    private List<Conta> contas;

    public Cliente() {
        this.id = UUID.randomUUID().toString();
        this.contas = new ArrayList<>();
    }

    public Cliente(String nome) {
        this();
        this.nome = nome;
    }

    @Override
    public String toString() {
        return id + ":" + nome;
    }

    public String getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public List<Conta> getContas() {
        return contas;
    }
    
}
