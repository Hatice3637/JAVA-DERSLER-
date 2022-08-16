package day08_ıfStatement;

import java.util.Scanner;

public class C03_NestedIfElse {


    public static void main(String[] args) {


        /*
        Emeklilik kontrolü yapan bir proram yazınız.
        cisnsiyet E ve K değişkenleri kabul etsin.
        Farklı bir sembol ise hata versin

        emeklilik için kadın=60 erkekler =65

        neatif veya 80 irilirsen hata versin.
         */


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi yaziniz" +
                "\n Kadin icin K Erkek icin E harfini giriniz");
        char cinsiyet = scan.next().toUpperCase().charAt(0);
        System.out.println("Lutfen yasinizi giriniz");
        double yas = scan.nextDouble();

        if (cinsiyet == 'E') {
            if (yas < 0 || yas > 80) {
                System.out.println("geçerli yas giriniz");
            } else if (yas < 65) {
                System.out.println("emekli olamazsın");
            } else {
                System.out.println("emekli olabilirsin");
            }

        } else if (cinsiyet == 'K') {
            if (yas < 0 || yas > 80) {
                System.out.println("geçerli yas giriniz");
            } else if (yas < 65) {
                System.out.println("emekli olamazsın");
            } else {
                System.out.println("emekli olabilirsin");

            }
        }
    }

}



