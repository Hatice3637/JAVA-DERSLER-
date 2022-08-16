package day15_overloading_forloop;

public class C04_Overloading {

    public static void main(String[] args) {


        topla(5, 7);//12
        topla(5.2,3);//8.2
        topla(3.4, 6.1);//9.5
        topla(5,6.2);


    }
    //eğer hic cast yapamadan kullanabileceği bir method varsa onu kullanır.


    public static void topla(int sayi1, int sayi2) {
        System.out.println(sayi1 + sayi2);
    }


    public static void topla(double sayi1, double sayi2) {
        System.out.println(sayi1 + sayi2);
    }

    public static void topla(double sayi1, int sayi2) {
        System.out.println(sayi1 + sayi2);
    }


    }




