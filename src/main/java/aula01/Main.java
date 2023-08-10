package aula01;

public class Main {
    
    public static void main(String[] args) {

        // Instanciar objeto do tipo Conta
        Conta contaHumberto = new Conta();
        
        contaHumberto.depositar(9.45);
        contaHumberto.sacar(20);
        contaHumberto.sacar(800);

        System.out.println(contaHumberto.getSaldo());

    }

}
