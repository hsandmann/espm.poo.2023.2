package aula02;

public class MainConta {
    
    public static void main(String[] args) {

        Conta cSelmini = new Conta();
        cSelmini.agencia = "123";
        cSelmini.numero = "321";

        cSelmini.saldo = 600.32;
        cSelmini.limite = Double.MAX_VALUE;
        
        add(cSelmini, 500);

        // Passagem de parametro por referencia, pois
        // a variavel cSelmini tem um endereco de memoria
        // dentro dela.
        System.out.println(cSelmini.saldo);
    }

    public static void add(Conta c, double valor) {
        c.saldo += valor;
    }

}
