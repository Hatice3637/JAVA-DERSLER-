package day03_scanner;

public class C02_Swap {


    public static void main(String[] args) {


         /*
        1- Verilen sayi1 ve sayi2 variable’larinin degerlerini degistiren (SWAP)
        bir program yaziniz
         Orn    : sayi1=10 ve
                  sayi2=20;
          kod calistiktan sonra
                  sayi1=20 ve
                  sayi2=10

 */

        int sayi1=10;
        int sayi2=20;
        int sayi3=0;
        //sayi3 gecici
        //adim 1_ sayi2 yi boş kovaya koyalım
        sayi3=sayi2;

        //1. sayıyı 2. sayıya ata

        sayi2=sayi1;

        //adim 3_boş kovadaki sayıyı sayı 1 ata

        sayi1=sayi3;

        System.out.println("swaptan sonra sayi1 : " + sayi1);
        System.out.println("swaptan sonra sayi2 : " + sayi2);



    }
}
