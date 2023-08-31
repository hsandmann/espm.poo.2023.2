package aula03;

import java.util.UUID;

public abstract class Cliente {

    protected String id;
    protected String nome;

    public Cliente() {

    }

    public Cliente(String nome) {
        this.id = UUID.randomUUID().toString();
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
    
}
