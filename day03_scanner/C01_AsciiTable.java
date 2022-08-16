package day03_scanner;

public class C01_AsciiTable {


    public static void main(String[] args) {

        int sayi=10;
        char harf='a';
        String str="banan";

        System.out.println(sayi+harf);//10a
        System.out.println(str+harf);//banana
        System.out.println(harf+2);//99
        System.out.println(str+sayi);//banan10


        //char yeniHarf=harf+2;


        /*
        1:char data turu işleme girdiğinde değişkenin turune göre farklı davranabilir.
        Eğer matematiksel işleme irdiği variable sayısal değerse sayi ibi davranır


        char yeniHarf=harf+2; java önce sağdaki işlemi yapar,
        sağdaki int + char görünce ascii değerini alır.

          //char yeniHarf=99
            bu atama java açısından kabul edilemez

        2:str+harf string variable çok güçlü.Hangi data türüyle işleme girerse girsin kendine benzetir.

         */

        System.out.println(""+sayi+harf);//10a
        //başına hiçlik koyarsak string olur.

        char deger='1';
        System.out.println(deger + harf);//'1' +'a'  sayı olur toplam 146
    }
}
