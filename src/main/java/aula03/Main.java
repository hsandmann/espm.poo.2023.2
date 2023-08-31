package aula03;

import java.util.Scanner;

public class Main {

    private static Banco banco = new Banco("ESPM");
    private static Scanner terminal = new Scanner(System.in);

    public static void main(String[] args) {
        
        Cliente currentCliente = null;
        Conta currentConta = null;

        while (true) {
            System.out.print(banco.nome + ":" + (currentCliente != null ? currentCliente.nome : "") + "> ");
            String line = terminal.nextLine().trim();

            // lista de comandos
            if ("0".equals(line) || "exit".equalsIgnoreCase(line)) break;
            else if ("?".equals(line)) menu(banco.nome);
            else if ("1".equals(line) || "add customer".equalsIgnoreCase(line)) {

                currentCliente = addCustomer();

            } else if ("2".equals(line) || "use customer".equalsIgnoreCase(line)) {

            

            } else if ("3".equals(line) || "add account".equalsIgnoreCase(line)) {

                if (currentCliente != null) {
                    currentConta = new Conta(currentCliente);
                } else {
                    System.out.println("selecione um cliente antes");
                }

            } else if ("9".equals(line) || "list customers".equalsIgnoreCase(line)) {

                banco.clientes.parallelStream().forEach(c -> {
                    String doc =
                        c instanceof PessoaFisica p ? p.getCpf() :
                        c instanceof PessoaJuridica p ? p.getCnpj() : null;
                    System.out.println(c + "> " + doc);
                });

            } else System.out.println("comando invalido");
        }
        System.out.println("bye bye");

    }

    public static void menu(String nameBank) {
        System.out.println(nameBank + " MENU");
        System.out.println("---------");
        System.out.println("[add customer] Criar cliente");
        System.out.println("[add account] Criar conta");
        System.out.println("0. Sair");
    }

    public static Cliente addCustomer() {
        System.out.print("Tipo de pessoa [F|J]: ");
        String tipoPessoa = terminal.nextLine();
        Cliente cliente = null;
        if ("F".equalsIgnoreCase(tipoPessoa)) {
            System.out.print("CPF: ");
            String cpf = terminal.nextLine();
            cliente = new PessoaFisica(cpf);
        } else if ("J".equalsIgnoreCase(tipoPessoa)) {
            System.out.print("CNPJ: ");
            String cnpj = terminal.nextLine();
            cliente = new PessoaJuridica(cnpj);
        }
        System.out.print("Nome: ");
        cliente.setNome(terminal.nextLine());
        String doc =
            cliente instanceof PessoaFisica p ? p.getCpf() :
            cliente instanceof PessoaJuridica p ? p.getCnpj() : null;

        for (Cliente c : banco.clientes) {
            if (c.equals(cliente)) throw new RuntimeException("Cliente já existe: " + doc);
        }
        banco.clientes.add(cliente);
        System.out.println(banco.clientes);
        return cliente;
    }
    
}
