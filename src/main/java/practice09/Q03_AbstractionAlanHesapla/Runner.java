package practice09.Q03_AbstractionAlanHesapla;

public class Runner {
    public static void main(String[] args) {
        //Dikdörtgen ve üçgenin alanlarını hesaplayan bir kod yazınız.(abstraction kullanın)
        Ucgen ucgen= new Ucgen();
        System.out.println("ucgen alanHesapla = " + ucgen.alanHesapla(23, 12));

        Dikdortgen dikdortgen=new Dikdortgen();
        System.out.println("dikdortgenin alanHesapla = " + dikdortgen.alanHesapla(20, 10));




    }
}
