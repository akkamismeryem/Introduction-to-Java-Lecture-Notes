package chapter01;

public class Degiskenler {
    public static void main(String[] args){

        // 1. TAMSAYI TİPLERİ (Integer types)
        byte sayiByte = 127;                // 8 bit  → -128 ile 127 arası değer tutar
        short sayiShort = 32000;            // 16 bit → -32768 ile 32767 arası
        int sayiInt = 1_000_000;            // 32 bit → sık kullanılan tam sayı tipi
        long sayiLong = 9_000_000_000L;     // 64 bit → büyük tam sayılar için (L eklenir)
        System.out.println("byte: " + sayiByte);
        System.out.println("short: " + sayiShort);
        System.out.println("int: " + sayiInt);
        System.out.println("long: " + sayiLong);

        // 2. ONDALIKLI SAYILAR (Floating point types)
        float sayiFloat = 3.14f;            // 32 bit → 'f' eklenmeli
        double sayiDouble = 3.14159265359;  // 64 bit → daha hassas
        System.out.println("float: " + sayiFloat);
        System.out.println("double: " + sayiDouble);

        // 3. KARAKTER TİPİ (Character)
        char karakter = 'A';                // Tek tırnak kullanılır
        char karakterKod = 66;              // 66 → ASCII'de 'B' karakteridir
        System.out.println("char: " + karakter);
        System.out.println("char (koddan): " + karakterKod);

        // 4. MANTIKSAL TİP (Boolean)
        boolean aktifMi = true;
        boolean tamamlandiMi = false;
        System.out.println("boolean aktifMi: " + aktifMi);
        System.out.println("boolean tamamlandiMi: " + tamamlandiMi);

        // 5. STRİNG (Referans tip - ilkel değil ama en yaygın)
        String isim = "Meryem"; // Metinler çift tırnak içinde
        System.out.println("String: " + isim);

        // -----------------------------------------
        // 6. TÜR DÖNÜŞÜMLERİ (Casting examples)
        // -----------------------------------------

        // A. Otomatik dönüşüm (Küçük tür → büyük türe)
        int sayi1 = 10;
        double sayi2 = sayi1; // int → double (otomatik olur)
        System.out.println("Otomatik dönüşüm (int→double): " + sayi2); // 10.0

        // B. Zorunlu dönüşüm (Büyük tür → küçük türe)
        double pi = 3.99;
        int tamPi = (int) pi; // double → int (ondalık kısmı atılır)
        System.out.println("Zorunlu dönüşüm (double→int): " + tamPi); // 3

        // C. char ↔ int dönüşümleri
        char harf = 'Z';
        int asciiKodu = (int) harf; // char → int (ASCII) -> Narrowing
        System.out.println("char→int: " + asciiKodu);
        char harf2 = (char) asciiKodu; // int → char -> Widening (Otomatik Casting)
        System.out.println("int→char: " + harf2);

        int asciiKodu1 = 65;
        System.out.println("int→char: " + asciiKodu1); // Otomatik

        // -----------------------------------------
        // 7. BİRLEŞİK ÖRNEK (Operatör, mantık ve cast)
        // -----------------------------------------
        int a = 3;
        int b = 4;
        System.out.println("x + y = " + a + b);       // string birleştirme: "x + y = 34"
        System.out.println("x + y = " + (a + b));     // toplama sonucu: "x + y = 7"

        int a1 = 5;
        double b1 = 2.0;
        System.out.println("int / double = " + (a1 / b1)); // 2.5

        int a2 = 10;
        int b2 = 3;
        double sonuc = a2 / b2; // int/int → 3 ama double olarak saklanır → 3.0
        int sonuc1 = a2 / b2;   // 3
        System.out.println("double sonuc: " + sonuc);
        System.out.println("int sonuc1: " + sonuc1);

        double a3 = 7.9;
        int b3 = (int) a3; // ondalık kısmı atılır
        System.out.println("double→int dönüşümü: " + b3);

        char c = 'B';
        System.out.println("char 'B' ASCII değeri: " + (int)c);

        char a4 = 65;
        System.out.println("ASCII 65 karakteri: " + a4);

        boolean durum = false;
        if (!durum) {
            System.out.println("Durum kapali");
        } else {
            System.out.println("Durum açik");
        }

        int sayiA = 5;
        int sayiB = 2;
        double result = (double)(sayiA / sayiB);
        double result2 = (sayiA / sayiB);
        double result3 = (double)sayiA / sayiB ;
        System.out.println("result: " + result);   // 2.0
        System.out.println("result2: " + result2); // 2.0
        System.out.println("result3: " + result3); // 2.5

        int x1 = (int)10.0; // double → int
        System.out.println("x1: " + x1);

        // -----------------------------------------
        //  8. Ek örnek: Sabit (final)
        // -----------------------------------------
        final double PI = 3.14159; // final → değeri değiştirilemez
        System.out.println("final PI: " + PI);

        // PI = 3.15; // Hata: final değiştirilemez
    }

}
