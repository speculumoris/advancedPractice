package practice10;

public class Q02_Faktoriyel_Loopsuz {
    public static void main(String[] args) throws Exception {
        //Faktoriyel hesaplayan bir method yazınız.(Loop kullanmayınız.)


        System.out.println(" faktoriyel sonucu ==> " + faktoriyel(-5));

    }

    public static int faktoriyel(int sayi) throws Exception {

        if (sayi > 0) {
            if (sayi == 1) {
                System.out.print(sayi);
                return 1;
            } else {
                System.out.print(sayi + "*");
                return sayi * faktoriyel(sayi - 1);
            }
        }else {
            throw new Exception("sayi sifirdan buyuk olmali");
        }

    }
}
