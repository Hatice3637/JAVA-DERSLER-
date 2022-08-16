package day05_matematikselişlemler;

public class C02_Pre_Post_Increment {

    public static void main(String[] args) {


        int sayi=10;
        System.out.println("pre : " + ++sayi);//1 adım


        System.out.println("post : " + sayi++);//2 adım
        System.out.println("post : " + +sayi);
    }
}
