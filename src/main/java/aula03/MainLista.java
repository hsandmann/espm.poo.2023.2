package aula03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class MainLista {

    public static void main(String[] args) {

        List<String> nomes = new Stack<>();

        nomes.add("Dylan");
        nomes.add("Luiz Gustavo");
        nomes.add("Ana");
        nomes.add("Ana");
        nomes.remove("Luiz Gustavo");
        nomes.add("Luiz Gustavo");

        Collections.sort(nomes);
        for (String nome : nomes) {
            System.out.println(nome);
        }
        
    }

}
