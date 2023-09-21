package aula05;

public class MainException {

    public static int div(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        try {
            int x = 10;
            int y = 0;
            int z = div(x, y);
            System.out.println(z);
        } catch(ArithmeticException e) {
            System.err.println(e.getMessage());
        } finally {
            System.out.println("byebye");
        }
    }

}
