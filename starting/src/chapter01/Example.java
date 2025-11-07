package chapter01;

//2) “Average of a sequence of nonnegative numbers; negative ends input (only main).”

import java.util.Scanner;
public class Example {
  public static void main(String[] args) {
    try (Scanner in = new Scanner(System.in)) {
        int count = 0;
        double sum = 0.0;

        while (true) {
          double x = in.nextDouble();  // kullanıcı sayı girer
          if (x < 0) break;            // negatifse bitir
          sum += x; count++;
        }
        if (count == 0) System.out.println("No data");
        else System.out.println("Average = " + (sum / count));
    }
    //Mantık: Negatif sayı sentry/terminator olarak kullanılıyor; ortalama yalnızca 0 veya pozitifler üzerinde.
  }
}