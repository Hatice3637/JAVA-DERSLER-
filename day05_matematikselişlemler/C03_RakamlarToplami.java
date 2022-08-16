package day05_matematikselişlemler;

import java.util.Scanner;

public class C03_RakamlarToplami {

    public static void main(String[] args) {

        //kullanıcıdan 4 basamaklı sayıyı giriniz

        Scanner scan=new Scanner(System.in);
        System.out.println("4 basamaklı tam sayı giriniz");
        int sayi=scan.nextInt();

        int birlerb=0;
        int rakamlartop=0;

        //sayı5267 bb=0  rt=0

        birlerb=sayi%10;//7
        rakamlartop+=birlerb;
        sayi/=10;

        //sayi526 bb=7 rt=7

        birlerb=sayi%10;//6
        rakamlartop+=birlerb;//13
        sayi/=10;

        //sayi52 bb=6 rt=13

        birlerb=sayi%10;//2
        rakamlartop+=birlerb;//15
        sayi/=10;

        //sayi5 bb=2 rt=15

        birlerb=sayi%10;//5
        rakamlartop+=birlerb;//20
        sayi/=10;

        //sayi0 bb=5 rt=20

        System.out.println("rakamlartop = " + rakamlartop);


    }
}
