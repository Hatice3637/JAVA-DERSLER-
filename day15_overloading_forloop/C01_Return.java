package day15_overloading_forloop;

public class C01_Return {

    public static void main(String[] args) {
        
        
        //verilen iki sayıyı çarpıp 
        //sonucu bize döndüren method
        
        int sayi1=10;
        int sayi2=5;
        
        int sonuc=carpgetir(sayi1,sayi2);

        System.out.println("sonuc = " + sonuc);
        
    }

    public static int carpgetir(int sayi1, int sayi2) {
        
        return sayi1*sayi2;
    }
}
