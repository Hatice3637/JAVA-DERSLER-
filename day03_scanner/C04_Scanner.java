package day03_scanner;

import java.util.Scanner;

public class C04_Scanner {


    public static void main(String[] args) {


        /*Kullanıcıdan 2 sayi alıp
        bu sayıların carpımı*/


        //1.adım

        Scanner scan=new Scanner(System.in);

        //2.adim

        System.out.println("sayıyı alınız");

        //3.adım

        double sayi1=scan.nextDouble();

        System.out.println("2. sayıyı giriniz");
        double sayi2=scan.nextDouble();

        System.out.println("Girilen sayıların çarpımı : " +sayi1+sayi2);
    }
}
