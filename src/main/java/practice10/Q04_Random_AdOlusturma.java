package practice10;

public class Q04_Random_AdOlusturma {
    //Rastgele alınan harfleri bir Stringe ekleyerek adınızı oluşturan
    // ve bunu kaç deneme ile yaptığını yazdıran bir kod yazınız.
    public static void main(String[] args) {
        String alfabe="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        int maxIdx=alfabe.length()-1;
        String isim="Ali";
        String yeniIsim="";
        int count=0;
        char c=' ';
        for (int i = 0; i < isim.length(); i++) {

            while (true){

               c= alfabe.charAt((int)(Math.random()*maxIdx));
               count++;
               if (c==isim.charAt(i)){
                   yeniIsim+=isim.charAt(i);
                   System.out.println(yeniIsim);
                   break;
               }
            }
        }
        System.out.println(count);
    }
}
