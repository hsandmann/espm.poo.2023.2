package aula06;

public class Main {
    
    public static void main(String[] args) {
        double x = 1.2;
        double y = 5.6;
        double z = 2.3;
        double s = soma(x, y, z);
        System.out.println(s);
    }

    public static double soma(double... elements) {
        double s = 0;
        for (double i : elements) s += i;
        return s;
    }

}
