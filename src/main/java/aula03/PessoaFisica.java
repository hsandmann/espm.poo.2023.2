package aula03;

public class PessoaFisica extends Cliente {

    private String cpf;

    public PessoaFisica(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }
    
}
