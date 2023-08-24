package aula03;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Banco banco = new Banco("ESPM");
        Cliente currentCliente = null;

        Scanner terminal = new Scanner(System.in);
        while (true) {
            System.out.print(banco.nome + ":" + (currentCliente != null ? currentCliente.nome : "") + "> ");
            String line = terminal.nextLine().trim();

            // lista de comandos
            if ("0".equals(line) || "exit".equalsIgnoreCase(line)) break;
            else if ("?".equals(line)) menu(banco.nome);
            else if ("1".equals(line) || "add customer".equalsIgnoreCase(line)) {

                System.out.print("Nome: ");
                String nome = terminal.nextLine();

                Cliente cliente = new Cliente(nome);
                banco.clientes.add(cliente);
                currentCliente = cliente;

            } else if ("2".equals(line) || "use customer".equalsIgnoreCase(line)) {

            

            } else if ("3".equals(line) || "add account".equalsIgnoreCase(line)) {

                if (currentCliente != null) {
                    Conta conta = new Conta(currentCliente);
                } else {
                    System.out.println("selecione um cliente antes");
                }

            } else if ("9".equals(line) || "list customers".equalsIgnoreCase(line)) {
                banco.clientes.parallelStream().forEach(c -> System.out.println(c.id + ": " + c.nome));
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
    
}
