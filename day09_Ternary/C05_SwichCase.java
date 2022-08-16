package day09_Ternary;

import java.util.Scanner;

public class C05_SwichCase {


    public static void main(String[] args) {



        /*
         kullanicidan gun numarasini alip
         1 ise pazartesi,
         ...
         7 ise pazar yazdiralim
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kacinci gun oldugunu giriniz");
        int gunNo = scan.nextInt();

        switch (gunNo) {

            case 1:
                System.out.println("pazartesi");
                break;
            case 2:
                System.out.println("salı");
                break;
            case 3:
                System.out.println("carsamba");
                break;
            case 4:
                System.out.println("perşembe");
                break;
            case 5:
                System.out.println("cuma");
                break;
            case 6:
                System.out.println("cumartesi");
                break;
            case 7:
                System.out.println("pazar");
                break;

            default:
                System.out.println("geçerli gün giriniz");


        }
    }
}