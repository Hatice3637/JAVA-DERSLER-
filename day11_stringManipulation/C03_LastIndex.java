package day11_stringManipulation;

public class C03_LastIndex {


    public static void main(String[] args) {

        String cumle="Java cok kolay,Java cok guzel";
        String kelime="java";



        /*
        verilen kelime cumlede kullanılmamış
        verilen kelime 1 kez kullanılmış
        verilen kelime birden fazla kullanlmış
         */


   int kelimeılkındex=cumle.indexOf(kelime);
   int kelimesonIndex=cumle.lastIndexOf(kelime);

   if(kelimeılkındex==-1){
       System.out.println(kelimeılkındex==kelimesonIndex);
   }else if(kelimeılkındex==kelimesonIndex){
       System.out.println("1 kez kullanılır");

   }else {
       System.out.println("verilen kelime 1 den fazla kullanılmış");
   }


    }



}
