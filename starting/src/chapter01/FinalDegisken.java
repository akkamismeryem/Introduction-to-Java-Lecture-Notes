package chapter01;

public class FinalDegisken {
    static final double pi = 3.15;
    static double radius = 2.78;

    public static void main(String[] args) {
        // pi = 3.14; olmaz
        double area = pi * radius * radius;
        System.out.println("The Area is " + area);
    }
}
