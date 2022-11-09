package practice07;

public class Q02_UzunKelime {
    public static void main(String[] args) {
        /*
          Kullanıcıdan alınan cümledeki en uzun kelimeyi(kelimeleri) return eden bir method oluşturunuz.
         */
        String cumle ="Kirmizi balik gölde kıvırıla yuzuyorsss ";
        String arr[]=cumle.split(" ");
        int max=0;

        for (int i = 0; i <arr.length ; i++) {
            max=Math.max(max, arr[i].length());
            if (arr[i].length()==max){
                System.out.println(arr[i]);
            }

        }
        System.out.println(max);



    }
}
