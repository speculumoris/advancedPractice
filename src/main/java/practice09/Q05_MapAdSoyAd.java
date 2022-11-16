package practice09;

import java.util.HashMap;
import java.util.Map;

public class Q05_MapAdSoyAd {
    public static void main(String[] args) {
        /*
      İki farklı Array'de aynı indekste barındırırılan ad ve soyadları örnekteki gibi yazdıran bir kod yazınız.
          input : {"John", "Mark", "Ali"}; {"Doe", "Twain", "Can"};
          output : {John=Doe, Mark=Twain, Ali=Can};
       */

        String []ad={"John", "Mark", "Ali"};
        String soyad[]={"Doe", "Twain", "Can"};
        Map<String,String > adSoyad=new HashMap<>();
        for (int i=0;i<ad.length;i++) {
            adSoyad.put(ad[i],soyad[i] );
        }
        System.out.println(adSoyad);
    }
}
