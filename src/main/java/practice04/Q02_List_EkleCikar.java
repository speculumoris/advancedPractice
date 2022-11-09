package practice04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q02_List_EkleCikar {
    public static void main(String[] args) {
        /*
        Kullanıcdan aldığınız bir sayıyı bir list'e ekleyen,
        list'ten çıkaran yada mevcut bir elementi o sayı ile güncelleyen bir kod yazınız.
 */
        Scanner scan=new Scanner(System.in);
        String option="";
        List<Integer> list=new ArrayList<>();

        do {
            System.out.println("Ekleme yapmak icin 'add'\n"+
                    "Guncelleme yapmak icin 'update'\n"+
                    "Silmek icin 'delete'\n"+
                    "Cikmak icin 'quit' komutunu giriniz");
            option=scan.next();
            if (option.equalsIgnoreCase("add")){
                System.out.println("eklemek istediginiz sayiyi giriniz");
                int eklenecekSAyi= scan.nextInt();
                list.add(eklenecekSAyi);
            } else if (option.equalsIgnoreCase("update")) {
                System.out.println("guncellemek istediginiz sayiyi giriniz");
                int guncellenecekSayi=scan.nextInt();
                System.out.println("Girmek istediginiz yeni sayiyi giriniz");
                int yeniSayi=scan.nextInt();
                list.set(list.indexOf(guncellenecekSayi),yeniSayi);
            }else if(option.equalsIgnoreCase("delete")){
                System.out.println("silmek istediginiz sayiyi giriniz");
                int silinecekSayi = scan.nextInt();
                list.remove(list.indexOf(silinecekSayi));
            }else if(option.equalsIgnoreCase("quit")){
                break;
            }else {
                System.out.println("gecerli bir komut giriniz");
            }
            System.out.println(list);
        }while(true);
        System.out.println("Gule Gule");
    }
}
