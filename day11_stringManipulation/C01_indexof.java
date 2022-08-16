package day11_stringManipulation;

public class C01_indexof {

    public static void main(String[] args) {


        String str="Java ogrenmek cok guzel";

        System.out.println(str.indexOf("g"));//6
        System.out.println(str.indexOf("mek"));//ilk harfini alır yani m yi ve 10
        System.out.println(str.indexOf("g",6));//6 dahil sonrası g

    }
}
