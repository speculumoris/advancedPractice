package practice09;

import java.util.HashMap;
import java.util.Map;

public class Q06_KelimeleriSAy {
    /*

 Bir String içerisindeki kelimelerin kaç kez tekrar ettiğini bulan bir method yazınız.

 input: "Ali okula geldi ve Ayse de okula geldi."
 output: Ali = 1, okula = 2, geldi = 2, ve = 1, Ayse= 1, de = 1

*/
    public static void main(String[] args) {
        String kelime = "Ali okula geldi ve Ayse de okula geldi.";

        kelimeleriSay(kelime);
        String arr[] = kelime.split(" ");

        String st = "";
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (!st.contains(arr[i])) {
                    st=st+" "+arr[i];
                    count++;
                    System.out.println(st+"="+arr[i]);
                } else {
                    count++;
                }
            }

        }
        System.out.println(st);
    }


    public static void kelimeleriSay(String str) {
        String yeniString = str.replaceAll("\\p{Punct}", "").replaceAll("\\s+", " ").trim();
        System.out.println("yeniString = " + yeniString);
        String arr[] = yeniString.split(" ");
        Map<String, Integer> map = new HashMap<>();

        for (String w : arr) {
            if (!map.containsKey(w)) {
                map.put(w, 1);
            } else {
                map.put(w, map.get(w) + 1);
            }
        }
        System.out.println(map);
    }

}
