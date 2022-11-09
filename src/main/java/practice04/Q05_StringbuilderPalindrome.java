package practice04;

public class Q05_StringbuilderPalindrome {
    //Bir String degerin palindrome olup olmadigini kontrol eden bir code yaziniz


    public static void main(String[] args) {
        String stc="ey edip adanada pide ye";
        String reverse="";
        for (int i = stc.length()-1; i >-1 ; i--) {
            reverse+=stc.charAt(i);

        }
        System.out.println(reverse);
        if (stc.equalsIgnoreCase(reverse)){
            System.out.println("palindrome'dur");
        }else System.out.println("palindrome degil");

        String str="nazan";
        StringBuilder stb= new StringBuilder(str);
        String stbReverse= stb.reverse().toString();

        if (str.equalsIgnoreCase(stbReverse)){
            System.out.println("palindrome'dur");
        }else System.out.println("palindrome degil");


    }
}
