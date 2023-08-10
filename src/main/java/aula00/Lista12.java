package aula00;

public class Lista12 {

    public static void main(String[] args) {
        int soma = 0;
        int limit = 4000000;
        for (int a = 1, b = 2, aux = 0; a <= limit; aux = a, a = b, b = a + aux)
            soma += (a % 2 == 0) ? a : 0;
        System.out.println(soma);
    }

}
