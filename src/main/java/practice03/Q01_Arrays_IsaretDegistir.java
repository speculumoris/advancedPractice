package practice03;

import java.util.Arrays;

public class Q01_Arrays_IsaretDegistir {
    public static void main(String[] args) {
        //Array içerisindeki elementlerin işaretlerini(+-) değiştiren bir kod yazınız.
        // input : 1,2,-3,4,-5,-6
        //output :-1,-2,3,-4,5,6

        int arr[]={1,2,-3,4,-5,-6};
        int arr1[]=new int[arr.length];
        int idx=0;
        for (int w:arr) {
                arr1[idx]=-1*w;
                idx++;
        }
        System.out.println(Arrays.toString(arr1));
    }
}
