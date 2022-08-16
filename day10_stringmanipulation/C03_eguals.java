package day10_stringmanipulation;

public class C03_eguals {


    public static void main(String[] args) {

        String isim="Ali Can";
        String isim2="Ali CAN";
        String isim3="Ali Can" + "";
        String isim4="Ali Can";

        System.out.println(isim==isim2);

        System.out.println(isim==isim3);//double da bazen false çıkabilir
        System.out.println((isim.equals(isim3)));
        
    }
}
