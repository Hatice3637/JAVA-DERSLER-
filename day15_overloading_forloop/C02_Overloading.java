package day15_overloading_forloop;

public class C02_Overloading {

    public static void main(String[] args) {

        /*
    yavada oluşturduğumuz metot isminin yaptığı iler ile uyumlu olmasını
    isteriz.Mesela bir string in bir bolümünü almak için
    subsitring() metho.(2ADET)

    Yer değişikliği için replace()(2ADET)

    Java aynı isim de birden fazla method var ise hangisinin kullanılacağına
    parametre sayısı ve parametrelerinin data türüne göre karar verir.


    */

        String str="Bu java ogrenilecek";

        str.substring(2);
        str.substring(2,4);

        str.replace('c','v');
        str.replace("J","H");

        /*
        Aynı isimde ama farklı methodları oluşturmak için
        değiştirebileceğimiz şeyler:

        1:parametre sayısı
        2:aynı sayıda parametreye sahip olsa dahi
        parametrelerin data türlerini değiştirebiliriz.
        3:aynı sayıda ve aynı data türünde  olan
        methodlarda parametrelerin sıralanışı değiştr.


         */

    }




}
