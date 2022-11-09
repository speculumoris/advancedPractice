package practice05;

public class Q05_Market_Constructor {
    //Ürün adı, ürün fiyatı ve (varsa) son kullanma tarihlerini yazdıran bir market programı yazınız..
    public static void main(String[] args) {
        Market ekmekObjesi=new Market("Ekmek",5,1);
        System.out.print("Urun adi: "+ekmekObjesi.urunAdi);
        System.out.print(" -Urun fiyati: "+ekmekObjesi.urunFiyati);
        System.out.print(" -Urunun Son kullanma tarihi: "+ekmekObjesi.sonKullanmaTarihi);
        System.out.println();
        Market nutellaObjesi=new Market("Nutella",45,2);
        System.out.print("Urun adi: "+nutellaObjesi.urunAdi);
        System.out.print(" -Urun fiyati: "+nutellaObjesi.urunFiyati);
        System.out.print(" -Urunun Son kullanma tarihi: "+nutellaObjesi.sonKullanmaTarihi);
        System.out.println();
        Market bardakObjesi=new Market("Bardak",50);
        System.out.print("Urun adi: "+bardakObjesi.urunAdi);
        System.out.print(" -Urun fiyati: "+bardakObjesi.urunFiyati);
        System.out.print(" -Urunun Son kullanma tarihi: "+bardakObjesi.sonKullanmaTarihi);






    }
}
