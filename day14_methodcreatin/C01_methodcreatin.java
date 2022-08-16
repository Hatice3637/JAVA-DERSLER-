package day14_methodcreatin;

public class C01_methodcreatin {

    public static void main(String[] args) {

        //input olarak verlen 4 harfli bir string
        //tersten yazdıran bir method


    }

    public static void terstenyazdir(String input){
        String tersInput=input.substring(3)+
                         input.substring(2,3)+
                         input.substring(1,2)+
                         input.substring(0,1);

        System.out.println("tersInput = " + tersInput);

}
}
