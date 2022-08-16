package day16_Forloop;

public class C04_NestedForLoop {

    public static void main(String[] args) {

        /*
        bazen tek değişkensorunu çözmeye yetmez
        *
        **
        ***
        ****
        *****

       */
            //yan yana 3 tane * yaz
        for (int i = 1; i <= 3; i++) {
            System.out.println("* ");

            //yan yana 4 tane * yaz

            for (int i1= 1; i <= 4; i++) {
                System.out.println("* ");

            //bu tür durumlarda nested(ic ice)

                for (int j = 1; j <=5; j++) {
                    for (int k = 1; k <=k ; k++) {
                        System.out.println("*");
                    }
                }

            }
        }
    }
}
