package practice09;

public class Q01_VarArgsNotOrtalamasi {
    public static void main(String[] args) {
        //	4 öğrencinin not ortalamasını sırasıyla 6, 4, 3 ve 5 sınav olacak şekilde hesaplayan bir method yazınız.


        ortalamaHesapla("Ali",96.9,96.7,100,100,96,95);
        ortalamaHesapla("Ayse",96.9,96.7,100,100);
        ortalamaHesapla("Fatma",96.9,96.7,100);
        ortalamaHesapla("Hayriye",96,96,100,85,88);

    }

    public static void ortalamaHesapla(String isim,double...not){
        double toplam=0;
        for (double w:not) {
            toplam+=w;
        }
        System.out.println(isim+" 'nin not ortalamasi: "+toplam/not.length);
    }
}
