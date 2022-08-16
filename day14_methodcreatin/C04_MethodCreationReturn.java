package day14_methodcreatin;

public class C04_MethodCreationReturn {


    //verilen isim ve soyisminin ilk harfi büyük
    //geriye kalanlar*
    //bu halini dönüren method

    public static void main(String[] args) {


        String isim = "Enes";
        String soyisim = "Bozkurt";

        String gizliisim = isimgizle(isim, soyisim);
        System.out.println("gizliisim = " + gizliisim);
        System.out.println("isim = " + isim);
        System.out.println("soyisim = " + soyisim);
    }

    public static String isimgizle(String isim, String soyisim) {
        isim = isim.substring(0, 1).toUpperCase()
                + isim.substring(1).replaceAll("\\w", "*");
        soyisim = soyisim.substring(0, 1).toUpperCase()
                + soyisim.substring(1).replaceAll("\\w", "*");

        return isim+" "+soyisim;


    }
}
