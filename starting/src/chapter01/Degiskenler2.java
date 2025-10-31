package chapter01;

public class Degiskenler2 {
        public static void main(String[] args){

            // Basit toplama örneği
            int x = 3;
            int y = 4;

            // Bu satırda + işleci soldan sağa işler.
            // "x + y = " + x → önce string + sayı = string olur, sonra + y yine string birleştirme yapar.
            System.out.println("x + y = " + x + y); // Sonuç: "x + y = 34" (çünkü string birleştirme yaptı)

            // Parantez içinde (x + y) yazınca önce toplama yapılır, sonra string'e çevrilir.
            System.out.println("x + y = " + (x + y)); // Sonuç: "x + y = 7"

            // Tam sayı ve ondalıklı sayı bölme
            int a1 = 5;
            double b1 = 2.0;
            // int / double işlemi → otomatik olarak double sonuç verir (Widening)
            System.out.println(a1 / b1); // Sonuç: 2.5

            // İki tam sayının bölümü
            int a2 = 10;
            int b2 = 3;
            double sonuc = a2 / b2; // int / int işlemi tam sayı bölmesi yapar → sonuç 3, ama double'a atanır → 3.0 olur
            int sonuc1 = a2 / b2;   // Bu da 3 olarak kalır
            System.out.println(sonuc);  // 3.0
            System.out.println(sonuc1); // 3

            // Tür dönüşümü (casting)
            double a3 = 7.9;
            int b3 = (int) a3; // double → int dönüşümünde ondalık kısmı atar (yuvarlamaz)
            System.out.println(b3); // 7

            // Karakter (char) → ASCII kodu
            char c = 'B';
            System.out.println((int)c); // 'B' karakterinin ASCII değeri 66’dır

            // ASCII kodu → karakter
            char a = 65; // 65 sayısı ASCII tablosunda 'A' karakterine denk gelir
            System.out.println(a); // A

            // Mantıksal (boolean) örneği
            boolean durum = false;
            if (!durum) { // !durum → false’un tersini alır → true olur
                System.out.println("Durum kapali");
            }
            else {
                System.out.println("Durum açik");
            }

            // Tür dönüşümü ile bölme farkları
            int a4 = 5;
            int b4 = 2;
            // (a4 / b4) önce int/int → 2 sonucu verir, sonra double’a çevrilir → 2.0 olur
            double result = (double)(a4 / b4);
            // a4 / b4 zaten 2’dir → double’a atanınca 2.0 olur
            double result2 = (a4 / b4);
            // (double)a4 / b4 → ilk sayı double olduğu için işlem double/double → 2.5 olur
            double result3 = (double)a4 / b4;
            System.out.println(result);  // 2.0
            System.out.println(result2); // 2.0
            System.out.println(result3); // 2.5

            // Geçersiz atama örneği
            // int x1 = 10.0;  // Hata: double → int otomatik atanamaz (veri kaybı olabilir)
            int x1 = (int)10.0; // Bu şekilde cast ederek atayabiliriz
            System.out.println(x1); // 10
            
    }
}
