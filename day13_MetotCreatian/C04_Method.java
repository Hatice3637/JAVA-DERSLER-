package day13_MetotCreatian;

public class C04_Method {

    public static void main(String[] args) {



        //input olarak verilen 2 int toplayıp sonucunu yazdıran bir method oluşturun

        int input1=10;
        int input2=20;

        //method 4 adımda oluşturulur.
        //1. adım method call
        //2.adım argument eklenmesi gerekiyorsa ekleyelim
        //eğer methodun return type void den farklı olacaksa bir variable olştur ve method call assign et
        

        topla(input1,input2);
        


    }

    private static void topla(int input1, int input2) {


        //3. adımda method da değiştirşlmesi gereken(acces modifier yada return typ )değiştir

        //4. eger return type void dışında birşey ise return keyword ve dönecek değeri hesapla

        System.out.println("girilen 2 sayının toplamı" +( input1+input2));
    }


}
