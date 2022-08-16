package day11_stringManipulation;

public class C06_EndWhith {

    public static void main(String[] args) {


        String input="fatih@gmail.com";

        if(!input.contains("@gmail.com")){
            System.out.println("Lutfen gmail adresi giriniz");
        }else if(input.endsWith("@gmail.com")){
            System.out.println("emaliniz kaydedildi");
        }else{
        }
        System.out.println("lütfen yazımı kontrol ediniz");
    }
}
