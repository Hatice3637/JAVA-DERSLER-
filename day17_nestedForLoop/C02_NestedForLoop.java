package day17_nestedForLoop;

public class C02_NestedForLoop {

    //verilen sayıya göre çarpım tablosu
    /*
    input 3
    123
    246
    369
     */

    public static void main(String[] args) {

        for (int i = 1; i <=3; i++) {//satırlar 3 tane 1 den 3 e kadar
            for (int j = 1; j <=3 ; j++) {

                System.out.print(i*j + " ");

            }
            System.out.println("");
        }
    }

}
