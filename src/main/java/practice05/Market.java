package practice05;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Market {
    String urunAdi;
    double urunFiyati;
    String sonKullanmaTarihi;



    public Market(String urunAdi,double urunFiyati,int aySonra){
        this.urunAdi=urunAdi;
        this.urunFiyati=urunFiyati;
        this.sonKullanmaTarihi=LocalDate.now().plusMonths(aySonra).toString();
    }
    public Market(String urunAdi,double urunFiyati){
        this.urunAdi=urunAdi;
        this.urunFiyati=urunFiyati;
    }
}
