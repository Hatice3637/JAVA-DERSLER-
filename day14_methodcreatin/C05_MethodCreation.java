package day14_methodcreatin;

import java.util.Scanner;

public class C05_MethodCreation {


    public static void main(String[] args) {

        //kullanıcıdan sehir ismini ve doğum tarihini alın
        //programda kullanacağımız formatta bize döndüren bir method
        //sehir ismini proramda buyukharf olarak
        //tarihi ise 2022-06-30 seklinde kullanmak istiyoruz

        String sehir = sehirAl();
        String tarih = tarihAl();

        System.out.println("tarih = " + tarih);
        System.out.println("sehir = " + sehir);

    }

    public static String tarihAl() {
        String tarih = "";
        Scanner scan = new Scanner(System.in);

        System.out.println("yıl giriniz");
        int yıl = scan.nextInt();

        if (yıl < 1900 && yıl < 2100) {
            tarih = yıl + "-";

        } else {
            System.out.println("yıl için gecerli sayı yazın");
        }

        System.out.println("kaçıncı ay olduğunu yazınız");
        int ay = scan.nextInt();

        if (ay <= 0 || ay > 12) {
            System.out.println("ay no1-12 arasında");
        } else if (ay < 10) {
            tarih = tarih + "0" + ay + "-";

        } else {
            tarih = tarih + ay + "-";
        }

        System.out.println("ayın kaçıncı gün olduğunu giriniz");
        int gun = scan.nextInt();

        if (gun <= 0 || gun > 31) {
            System.out.println("gun no 1-31 ");
        } else if (gun < 10) {
            tarih = tarih + gun;

        } else {
            tarih = tarih + gun;
        }
        return tarih;

    }


    public static String sehirAl() {

        Scanner scan=new Scanner(System.in);
        System.out.println("sehir adı ");
        String sehiradı=scan.next().toUpperCase();
        return sehiradı;


    }
}