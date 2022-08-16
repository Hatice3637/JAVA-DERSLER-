package day14_methodcreatin;

public class C03_MethodCreation {


    public static void main(String[] args) {

        //ınput olarak verilen isim ve soyismi
        //ilk harfi buyuk geriye kalan harfler yıldız olacak şekilde
        //ı****** K***** YAZDIRAN BİR METHOD

        String isim="Enes";
        String soyisim="Bozkurt";


    }

    public static void ismiGizle(String isim, String soyisim) {
        isim= isim.substring(0,1).toUpperCase()
                +isim.substring(1).replaceAll("\\w","*");
        soyisim=soyisim.substring(0,1).toUpperCase()
                +soyisim.substring(1).replaceAll("\\w","*");
        System.out.println(isim + " "+ soyisim);
    }
}