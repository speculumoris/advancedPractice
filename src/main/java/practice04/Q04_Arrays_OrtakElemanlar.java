package practice04;

import java.util.ArrayList;
import java.util.List;

public class Q04_Arrays_OrtakElemanlar {
    /*
     * İki Array'de ortak bulunan elementleri yazdırınız.
     * (case sensitivity olmadan)

     * Input1 : {John,Brad,Angel,Sofia,Emily} Input2 : {sofia,brad,grace,emily,hazel}

     * Output : [brad,sofia,emily]
     */
    public static void main(String[] args) {
        String arr1[]={"John","Brad","Angel","Sofia","Emily"};
        String arr2[]={"sofia","brad","grace","emily","hazel"};
        List<String>eklenen=new ArrayList<>();
        for (String w:arr1) {
            for (String a:arr2) {
                if (w.equalsIgnoreCase(a)){
                    eklenen.add(w);
                }

            }

        }
        System.out.println(eklenen);
    }
}
