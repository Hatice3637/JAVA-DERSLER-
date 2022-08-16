package day16_Forloop;

public class C02_forloophatalar {

    public static void main(String[] args) {

        //1.başlangıç noktasından sonra
        //bitiş şartına yaklaşmıyorsak sonsuz loop oluşur

       /* for (int i = 0; i >-10 ; i++)
         System.out.println(i);
        */


        //2.eğer ilk değer için bile bitiş sartı sağlanmıyorsa
        //for loop calışır
        //fakat loop body si dvreye girmez

        for (int i = 0; i > 5; i++) {
            System.out.println(i);
        }
    }


}
