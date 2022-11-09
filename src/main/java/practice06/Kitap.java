package practice06;

public class Kitap {
    String kitapAdi;
    String yazarAdi;
    int sayfaAdedi;
    String sseriNo;
    static  int kitapSayisi;

    public Kitap(String kitapAdi, String yazarAdi, int sayfaAdedi ) {
        this.kitapAdi = kitapAdi;
        this.yazarAdi = yazarAdi;
        this.sayfaAdedi = sayfaAdedi;
        kitapSayisi++;
        sseriNo = kitapAdi.substring(0,2)+yazarAdi.substring(0,2)+kitapSayisi;
    }
    public void kitapBilgileri(){
        System.out.println("Kitap adi: "+kitapAdi+"\n yazar adi :"+yazarAdi+
                "\n Sayfa sayisi :"+sayfaAdedi+"\n seri no:"+sseriNo);

    }
}
