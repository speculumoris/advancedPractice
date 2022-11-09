package practice06;

public class Q01_RandomSAyiMatrix {
    public static void main(String[] args) {
        /*

Kullanıcıdan aldığınız bir sayi kadar satır ve sütun sayısına sahip alttaki rastgele 0 ve 1'lerden oluşan matriksi yazdırın.

Input: 10

Output:
1 0 0 1 1 0 0 0 1 1
0 0 1 0 1 0 1 0 0 0
0 1 0 1 0 0 0 0 0 1
1 1 1 0 0 0 0 1 1 1
1 1 0 1 1 1 0 1 0 0
1 0 0 0 1 1 0 0 0 0
0 0 1 0 0 0 0 1 1 1
1 1 0 1 0 1 0 0 1 0
0 0 1 0 0 0 0 1 1 0
1 1 1 0 0 1 1 1 1 0

*/

        int input=10;
        for (int i = 0; i <=input; i++) {
            for (int j = 0; j <=input; j++) {
                System.out.print((int)(Math.random()*2)+" ");
            }
            System.out.println();
        }

    }
}
