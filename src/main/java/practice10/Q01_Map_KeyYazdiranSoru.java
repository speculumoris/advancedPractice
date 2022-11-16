package practice10;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Q01_Map_KeyYazdiranSoru {
    public static void main(String[] args) {
        //Aşağıda verilen fiyat listesinden fiyatı 29.99 olan ürünlerin adlarını yazdırınız.
        Map<String, Double> urunler = new HashMap<>();
        urunler.put("Kemer", 19.99);
        urunler.put("Gomlek", 29.99);
        urunler.put("Kazak", 24.99);
        urunler.put("Pijama", 29.99);
        urunler.put("Ayakkabi", 89.99);
        urunler.put("Kravat", 19.99);
        urunler.put("Terlik", 29.99);
        System.out.println("Fiyati 29.99 olan ürünler");

        for (Map.Entry<String, Double> w:urunler.entrySet()) {//Eger value'ya baagli key isteniyorsa
                                                              // birbirlerine bagli bir seyler isteniyorsa EntrySet kullan
            if (w.getValue()==29.99){
                System.out.println(w.getKey()+"="+w.getValue());
            }

        }
    }

}
