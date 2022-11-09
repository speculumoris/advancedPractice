package practice06;

public class Q04_Kutuphane_ {
    public static void main(String[] args) {
        //Kütüphaneye eklemek istediğiniz kitapları, adı, yazar adı, sayfa sayısı, seri numarası ile yazdıran bir kod yazınız.
        Kitap kitap1=new Kitap("Harry Potter","J.K.Rowling",650);
        kitap1.kitapBilgileri();
        System.out.println();
        Kitap kitap2=new Kitap("bülbül","meşa",200);
        kitap2.kitapBilgileri();
    }
}
