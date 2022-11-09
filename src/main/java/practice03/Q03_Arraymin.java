package practice03;

public class Q03_Arraymin {
    public static void main(String[] args) {
        // Bir Array içerisindeki 'minimum', 'maksimum'  ve 'ikinci maksimum' değerleri bulan bir kod yazınız.
        //
        //   input: int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1};
        //   output: min:-90, max:10001, secMax: 8787

        int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1};

        int min=arr[0];
        int max=arr[0];
        int ikinciMax=arr[0];
        for (int w:arr) {

            min=Math.min(min,w);
            max=Math.max(max,w);
            if (max>w ){
                ikinciMax=Math.max(ikinciMax,w);
            }

        }
        System.out.println("first maximum element :"+max+" "+"minimum element :"+min);
        System.out.println("ikinci maximum element :"+ikinciMax);


    }
}
