package day05_matematikselişlemler;

public class C01_Pre_Post_Increment {


    public static void main(String[] args) {


        int sayi1=10;

        int sayi2=sayi1+1;

        /*
        pre vepost ta ++ ve-- işlemi için geçerli.
         */

        int sayi3=sayi2++;//sayi3=11 olur sonra sayi2=12

        System.out.println("sayi3 = " + sayi3);
        System.out.println("sayi2 = " + sayi2);

        int sayi4=++sayi1;//sayi1=11 ve sayi4=11
        System.out.println("sayi4 = " + sayi4);
        System.out.println("sayi1 = " + sayi1);




    }
}
