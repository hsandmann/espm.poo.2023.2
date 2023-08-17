package aula00;
public class Lista14 {
    public static void main(String[] args) {
        int maior = Integer.MIN_VALUE;
        int a = 999, b = 999;
        for ( ; a > 99; a -= 1, b = 999)
            for ( ; b > 99; b -= 1)
                maior = habemusPalindrome(a *  b) && (a * b > maior) ? a * b : maior;
        System.out.println(maior);
    }

    public static boolean habemusPalindrome(int x) {
        String palavra = String.valueOf(x);
        for (int i = 0; i < palavra.length() / 2; i++)
            if (palavra.charAt(i) != palavra.charAt(palavra.length() - i - 1))
                return false;
        return true;
    }

}
