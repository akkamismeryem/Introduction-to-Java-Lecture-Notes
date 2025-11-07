package chapter01;

public class Degiskenler3 {
    public static void main(String[] args){
    // C1
    int a = 1;
    int b = 2;
    System.out.println("Toplam: " + a + b);
    // Çıktı: Toplam: 12

    // C2
    int x = 10;
    {
    int y = x + 5;
    }
    // System.out.println(y);
    // Derlenmez: y scope dışında

    // C3
    double d = 5 / 2;      
    System.out.println(d); 
    // 2.0 (int/int önce 2, sonra double'a atanır)

    // C4
    int[] t = new int[2];
    t[0] = 7;
    System.out.println(t[1]);
    // 0

    // C5
    int[] p = null;
    System.out.println(p.length);
    // NullPointerException (runtime)

    //“What is the value of c[50] after this declaration: char[] c = new char[100];”
    char[] c = new char[100];
    System.out.println((int) c[50]); // 0
    }

    
}
