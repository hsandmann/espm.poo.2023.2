package aula02;

public class MainFatorial {
    
    public static void main(String[] args) {
        int n = 5;
        int resultado = fatorial(n);
        System.out.println(resultado);
    }

    public static int fatorial(int x) {
        return x > 1 ? x * fatorial(x - 1) : 1;
    }

}
