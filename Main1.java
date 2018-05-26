import java.util.Arrays;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {

        int[] arr = new int[6];
        Scanner scan = new Scanner(System.in);
        System.out.println("podaj tablice");
        for (int i=0; i<arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int count = 100000;
        int temp;
        for (int i=0; i<arr.length-1; i++) {
            temp = arr[i+1] - arr[i];
            if (count>temp) {
                if (temp!=0) {
                    count = temp;
                }
            }
        }
        System.out.println(count);
    }
}
