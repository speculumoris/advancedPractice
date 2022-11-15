package practice09;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class Q02_Map_UrunFiyatlariniTopla {
    public static void main(String[] args) {
        //Bir map içerisinde verilen fiyatların toplamını bulan bir kod yazınız.(for each loop kullanınız)
        //Örn: {Kemer=19.99, Gömlek=29.99, Ayakkabı=89.99, Kazak=24.99, Kravat=19.99} ==> Toplam: 184.95
        HashMap<String,Double> urunFiyati=new HashMap<>();
        urunFiyati.put("Kemer",19.99);
        urunFiyati.put("Gomlek",29.99);
        urunFiyati.put("Ayakkabi",89.99);
        urunFiyati.put("Kazak",24.99);
        urunFiyati.put("Kravat",19.99);
        System.out.println(fiyatToplami(urunFiyati));

    }
    public static double fiyatToplami(HashMap<String,Double> urunFiyati){
        Collection<Double>fiatlar=urunFiyati.values();
        double sum=0;
        for (Double w:fiatlar) {
            sum+=w;
        }
        return sum;
    }
}
