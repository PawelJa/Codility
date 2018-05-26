import java.util.Arrays;

public class Main2 {

    public static void main (String[] args) {
        int[] a = { 3, 8, 9, 7, 6 };
        System.out.println(Arrays.toString(a));
        int c = 3;

        for (int i=0; i<c; i++) {
            int[] b = new int[a.length];
            for (int j=0; j<a.length-1; j++) {
                b[j+1] = a[j];
                b[0] = a[a.length-1];
            }
            a = b;
        }
        System.out.println(Arrays.toString(a));
    }
}
