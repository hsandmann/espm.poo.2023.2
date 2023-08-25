package aula03;

public class MainSimples {

    public static void main(String[] args) {
        
        Banco banco = new Banco("ESPM");
        
        Conta c1 = new Conta(null);
        c1.sacar(10);

        Conta c2 = new Conta(null);
        c2.depositar(20);

        banco.contas.add(c1);
        banco.contas.add(c2);

        // for (int i = 0; i < banco.contas.size(); i++) {
        //     Conta conta = banco.contas.get(i);
        //     if (conta.saldo > 0)
        //         System.out.println( conta.saldo );
        // }

        for (Conta conta : banco.contas) { 
            if (conta.saldo > 0)
                System.out.println( conta.saldo );
        }

        System.out.println(banco.contas);

    }
    
}
