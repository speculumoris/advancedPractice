package practice05;

public class Q02_NestedFor_ucgen {
    public static void main(String[] args) {
        /*
        Kullanıcıdan aldığınız satır sayısına göre aşağıdaki şekli yazdıran bir kod yazınız.

               *
              * *
             * * *
            * * * *
           * * * * *
 */
        int input =5;
        for (int i = 0; i <=input ; i++) {
            for (int j = input-i; j >-1 ; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i ; j++) {
                System.out.print(" *");

            }
            System.out.println();

        }
    }
}
