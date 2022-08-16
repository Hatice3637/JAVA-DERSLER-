package day10_stringmanipulation;

import java.util.Locale;

public class C02_toLowerCase_toUpper {


    public static void main(String[] args) {

        String str=("beni psikopata bağlamayın");

        System.out.println(str.toUpperCase());

        System.out.println(str.toUpperCase().toUpperCase(Locale.forLanguageTag("Tr")));
        //local bir dil kullanmak istersek(türkçe karakterler)





    }
}
