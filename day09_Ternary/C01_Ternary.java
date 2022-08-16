package day09_Ternary;

import java.util.Scanner;

public class C01_Ternary {


    public static void main(String[] args) {

        // Soru3 ) Kullanicidan bir sayi alin ve sayinin mutlak degerini yazdirin
        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen bir sayi giriniz");
        double sayı=scan.nextDouble();

        System.out.println(sayı>=0? sayı:(-1*sayı));
    }
}
