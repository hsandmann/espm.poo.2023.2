package aula03;

public class PessoaJuridica extends Cliente {

    protected final String cnpj;

    public PessoaJuridica(String cnpj) {
        super();
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }
    
}
