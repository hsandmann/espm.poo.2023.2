package aula03;

public class MainSimples {

    public static void main(String[] args) {

        try {
        
            Banco banco = new Banco("ESPM");
            
            Conta c1 = new ContaCorrente(null);
            c1.sacar(10);

            Conta c2 = new ContaPoupanca(null);
            c2.depositar(20);

            banco.getContas().add(c1);
            banco.getContas().add(c2);

            // for (int i = 0; i < banco.contas.size(); i++) {
            //     Conta conta = banco.contas.get(i);
            //     if (conta.saldo > 0)
            //         System.out.println( conta.saldo );
            // }

            for (Conta conta : banco.getContas()) { 
                if (conta.getSaldo() > 0)
                    System.out.println( conta.getSaldo() );
            }

            System.out.println(banco.getContas());
        } catch (BancoException e) {
            e.printStackTrace();
        }

    }
    
}
