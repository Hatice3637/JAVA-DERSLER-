package day14_methodcreatin;

public class C02_MethodCreation {

    public static void main(String[] args) {

        //verilen bir sayının rakamları toplamı yazdıran method
        
        
       int input=423;
       
       rakamlarıtopla(input);


    }

    private static void rakamlarıtopla(int input) {
        
        int birlerbasamağı=0;
        int rakamlartoplamı=0;

        
        birlerbasamağı=input%10;
        rakamlartoplamı+=birlerbasamağı;
        input/=10;

        birlerbasamağı=input%10;
        rakamlartoplamı+=birlerbasamağı;
        input/=10;

        birlerbasamağı=input%10;
        rakamlartoplamı+=birlerbasamağı;
        input/=10;

        System.out.println("rakamlartoplamı = " + rakamlartoplamı);



    }


}
