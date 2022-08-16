package day10_stringmanipulation;

public class C01_charAt {


    public static void main(String[] args) {
        String str="Java öğrenmek ne güzel";

        System.out.println(str.charAt(0));//ilk harf j

        System.out.println(str.toUpperCase().charAt(7));//R

        System.out.println(str.charAt(22));//hata verir exception

    }
}
