package aula02;

public class MainPrimitiveType {

    public static void main(String[] args) {
        int n = 2;
        add(n);
        System.out.println(n);

        String msg1 = "Ola mundo";
        String msg2 = "Ola ";
        String msg3 = "mundo";
        msg2 = msg2 + msg3;
        String msg4 = "Ola mundo";

        System.out.println("1. " + msg1 + "==" + msg2 + "? " + (msg1 == msg2));
        System.out.println("2. " + msg1 + "==" + msg2 + "? " + (msg1.equals(msg2)));
        System.out.println("3. " + msg1 + "==" + msg4 + "? " + (msg1 == msg4));

        System.gc();
    }

    public static void add(int x) {
        x++;
    }

}
