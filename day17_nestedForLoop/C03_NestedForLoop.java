package day17_nestedForLoop;

public class C03_NestedForLoop {

    /*
    verlilen    yükseklik ve boy degerine göre * lardan oluşan bir dikdörten

    yükseklik;3 boy;4

    ****
    ****
    ****

     */

    public static void main(String[] args) {

        int yükseklik=4;
        int boy=8;
        for (int i = 1; i <=yükseklik ; i++) {//dış loop satırları outerloop
            for (int j = 1; j <=boy ; j++) {//iç loop inerloop
                System.out.println("*");
            }
            System.out.println("");
        }
    }
}
