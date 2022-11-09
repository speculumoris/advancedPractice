package practice07;

import java.util.Scanner;

public class Q03_AtbashCode {
    public static void main(String[] args) {
        /*
      Kullanıcıdan aldığınız bir metni 'Atbash Code' yöntemi ile şifreleyen bir kod yazınız.
      Ortadoğuda kullanılan en eski şifreleme biçimlerinden biridir.
      Arami alfabesinin tersten yazılması ile oluşturulan bir kodlayıcıya sahiptir.
      Örn: A-->Z, B-->Y ...
      "abcdefghijklmnopqrstuvwxyz";
      "zyxwvutsrqponmlkjihgfedcba";
     */
        Scanner scan=new Scanner(System.in);
        System.out.println("bir kelime girin");
        String duz="abcdefghijklmnopqrstuvwxyz";
        String ters="zyxwvutsrqponmlkjihgfedcba";
        String kelime=scan.nextLine();
        for (int i = 0; i < kelime.length(); i++) {
            for (int j = 0; j < duz.length(); j++) {
              if (kelime.charAt(i)==duz.charAt(j)){
                  System.out.print(ters.charAt(j));
              }
            }

        }



    }
}
