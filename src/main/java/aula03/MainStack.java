package aula03;

import java.util.Stack;

public class MainStack {
    
    public static void main(String[] args) {

        String sentence = "3 + 12 + 2 - 5 + 9";

        Stack<Integer> simbolos = new Stack<>();
        String op = null;
        double resultado = 0;
        for ( String el : sentence.split(" ")) {
            if ("+-/*".contains(el)) {
                op = el;
            } else {
                if (op != null && !simbolos.empty()) {
                    int anterior = simbolos.pop();
                    int atual = Integer.parseInt(el);
                    resultado +=
                        op.equals("+") ? anterior + atual :
                        op.equals("-") ? anterior - atual :
                        op.equals("/") ? anterior / atual :
                        anterior * atual;
                    op = null;
                } else simbolos.push(Integer.parseInt(el));
            }
        }
        System.out.println(resultado);
        System.out.println(simbolos);
        
    }

}
