package practice03;

import java.util.Scanner;

public class Q04_DoWhile_Top {
    public static void main(String[] args) {
        /*
 Bir top belirli yükseklikten atılmaktadır.
 Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
 Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
 Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.
 */
        Scanner sca=new Scanner(System.in);
        System.out.println("atilmasini istediginiz yukeksligi giriniz");
        double atilanYukseklik= sca.nextDouble();
        double yeniYukseklik=0;
        int counter =0;
        do {
            yeniYukseklik+=atilanYukseklik;
            atilanYukseklik=atilanYukseklik*3/4;
            yeniYukseklik+=atilanYukseklik;
            counter++;

        }while (atilanYukseklik>1);
        System.out.println(yeniYukseklik);
        System.out.println(counter);
    }
}
