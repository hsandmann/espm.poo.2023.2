package aula03;

public class PessoaFisica extends Cliente {

    private final String cpf;

    public PessoaFisica(String cpf) {
        super();
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public boolean equals(Object o) {
        return o != null
            && o instanceof PessoaFisica
            && ((PessoaFisica) o).getCpf().equals(this.cpf);
    }

    @Override
    public int hashCode() {
        return this.cpf.hashCode();
    }

    @Override
    public String toString() {
        return super.toString() + "|" + this.cpf;
    }
    
}
