package aula00;
public class Lista14a {

    public static void main(String[] args) {
        int maior = Integer.MIN_VALUE;
        for (int a = 999 ; a > 99; a -= 1)
            for (int b = 999 ; b > 99; b -= 1)
                maior = habemusPalindrome(a *  b) && (a * b > maior) ? a * b : maior;
        System.out.println(maior);
    }

    public static boolean habemusPalindrome(int x) {
        int alvo = 0;
        for (int aux = x; aux > 0; alvo *= 10, alvo += aux % 10, aux = (int) (aux / 10));
        return alvo == x;
    }

}
