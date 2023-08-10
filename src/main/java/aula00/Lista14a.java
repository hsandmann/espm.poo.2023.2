package aula00;
public class Lista14a {
    public static void main(String[] args) {
        int maior = Integer.MIN_VALUE;
        int a = 999, b = 999;
        for ( ; a > 99; a -= 1, b = 999)
            for ( ; b > 99; b -= 1)
                maior = habemusPalindrome(a *  b) && (a * b > maior) ? a * b : maior;
        System.out.println(maior);
    }

    public static boolean habemusPalindrome(int x) {
        int alvo = 0;
        int aux = x;
        for ( ; aux > 0; alvo *= 10, alvo += aux % 10, aux = (int) (aux / 10));
        return alvo == x;
    }
}
