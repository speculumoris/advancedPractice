package practice05;

public class Q01_Ascii {
    public static void main(String[] args) {
        //Kullanıcıdan aldığınız iki karakterin arasında bulunan tüm karakterleri yazdıran bir kod yazınız.
        int asci='a';
        int ascii='z';
        for (int i = asci; i <= ascii; i++) {
            char k=(char)i;
            System.out.println(k);
        }
    }
}
