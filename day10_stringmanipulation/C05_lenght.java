package day10_stringmanipulation;

public class C05_lenght {

    public static void main(String[] args) {


        String str="Java ogren,isi kap";
        System.out.println(str.length());//karakter sayısı 19

        System.out.println(str.charAt(str.length()-1));//son karakter


        System.out.println(str.charAt(str.length()-3));//sondan3. karakter

        String str2="";
        System.out.println(str2.length());//sıfır

        String str3=null;
        System.out.println(str3.length());//hata verdi
    }
}
