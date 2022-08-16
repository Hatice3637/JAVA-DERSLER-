package day15_overloading_forloop;

public class C06_StringTerseCevirme {


    public static void main(String[] args) {


        //input olarak verilen stringi terse ceviren ve yazdıran bir method


        String input="java gun geçtikce guzelleşiyor";
        terstenyazdır(input);
    }

    public static void terstenyazdır(String input) {

   String tersInput=input.substring(input.length()-1);

        for (int i = input.length()-2; i <input.length()-1 ; i--) {
            tersInput+=input.substring(i,i+1);

        }
        System.out.println(tersInput);



    }
}
