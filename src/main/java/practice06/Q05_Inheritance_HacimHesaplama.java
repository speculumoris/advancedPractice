package practice06;

public class Q05_Inheritance_HacimHesaplama {
    public static void main(String[] args) {


        //Kare prizma, silindir ve koninin hacmini hesaplayan bir kod yazınız.(Inheritance kullanınız)
        KarePrizma karePrizma = new KarePrizma();
        double karePRizmaHacmi=karePrizma.hacimHesapla(5,6);
        System.out.println(karePRizmaHacmi);
        Koni koni=new Koni();
        double koniHacim=koni.hacimHesapla(4,5);
        System.out.println(koniHacim);
        Silindir sil=new Silindir();
        double silindirHacmi=sil.hacimHesapla(4,3);
        System.out.println(silindirHacmi);



    }
}
