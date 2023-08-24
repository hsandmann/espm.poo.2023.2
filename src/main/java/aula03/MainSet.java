package aula03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MainSet {

    public static void main(String[] args) {

        Set<String> nomes = new TreeSet<>();

        nomes.add("Dylan");
        nomes.add("Luiz Gustavo");
        nomes.add("Ana");
        nomes.add("Ana");
        nomes.add("Luiz Gustavo");

        for (String nome : nomes) {
            System.out.println(nome);
        }
        
    }

}
