package aula03;

import java.util.Scanner;

public class Main {

    private static Banco banco = new Banco("ESPM");
    private static Scanner terminal = new Scanner(System.in);

    public static void main(String[] args) {
        
        Cliente currentCliente = null;
        Conta currentConta = null;

        while (true) {
            System.out.print(
                banco.getNome() + ":" +
                (currentCliente != null ? currentCliente.nome : "") + 
                (currentConta != null ? (currentConta instanceof ContaCorrente ? "CC" : "CP") : "") +
                (currentConta != null ? " [" + currentConta.getSaldo() + "]" : "") +
                "> "
            );
            String line = terminal.nextLine().trim();

            try {
                // lista de comandos
                if ("".equals(line.trim())) {}
                else if ("0".equals(line) || "exit".equalsIgnoreCase(line)) break;
                else if ("?".equals(line)) menu(banco.getNome());
                else if ("666".equals(line) || "rendimento".equalsIgnoreCase(line)) {
                    banco.calcularRendimentos();
                } else if ("1".equals(line) || "add customer".equalsIgnoreCase(line)) {

                    currentCliente = addCustomer();

                } else if ("2".equals(line) || "use customer".equalsIgnoreCase(line)) {

                

                } else if ("3".equals(line) || "add account".equalsIgnoreCase(line)) {

                    if (currentCliente != null) {
                        System.out.print("Tipo [P|C]? ");
                        currentConta = terminal.nextLine().equalsIgnoreCase("P") ?
                            new ContaPoupanca(currentCliente) :
                            new ContaCorrente(currentCliente);
                        banco.getContas().add(currentConta);
                    } else {
                        System.out.println("selecione um cliente antes");
                    }

                } else if ("9".equals(line) || "list customers".equalsIgnoreCase(line)) {

                    banco.getClientes().parallelStream().forEach(c -> {
                        String doc =
                            c instanceof PessoaFisica p ? p.getCpf() :
                            c instanceof PessoaJuridica p ? p.getCnpj() : null;
                        System.out.println(c + "> " + doc);
                    });
                } else if ("10".equals(line) || "deposit".equalsIgnoreCase(line)) {
                    System.out.print("valor: ");
                    double valor = Double.parseDouble(terminal.nextLine());
                    currentConta.depositar(valor);
                } else if ("11".equals(line) || "withdraw".equalsIgnoreCase(line)) {
                    System.out.print("valor: ");
                    double valor = Double.parseDouble(terminal.nextLine());
                    currentConta.sacar(valor);
                } else if ("20".equals(line) || "list accounts".equalsIgnoreCase(line)) {
                    if (currentCliente == null) throw new RuntimeException("Selecione o cliente primeiro");
                    currentCliente.getContas().forEach(c -> {
                        System.out.println(c + " [" + (c instanceof ContaPoupanca ? "CP" : "CC") + "]: " + c.getSaldo());
                    });
                } else throw new Exception("comando invalido");
            } catch (BancoException e) {
                System.err.println("Falha de regra: " + e.getTipo() + "[" + e.getTipo().codigo + "]");
            } catch (Exception e) {
                System.err.println("Erro: " + e.getMessage());
            }
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

        for (Cliente c : banco.getClientes()) {
            if (c.equals(cliente)) throw new RuntimeException("Cliente já existe: " + doc);
        }
        banco.getClientes().add(cliente);
        System.out.println(banco.getClientes());
        return cliente;
    }
    
}
