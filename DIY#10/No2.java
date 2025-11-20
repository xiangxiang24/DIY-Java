import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class No2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int[] a1 = new int[n1];
        for (int i = 0; i < n1; i++ ){
            a1[i] = scan.nextInt();
        }
        int n2 = scan.nextInt();
        int[] a2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            a2[i] = scan.nextInt();
        }
        
        ArrayList<Integer> tt = new ArrayList<>();
        for (int n : a1) {
            tt.add(n);
        } 
        for (int y : a2) {
            tt.add(y);
        }
        Collections.sort(tt);
        
        
        int len = tt.size();
        int m = len/2;
        int M = (len/2) - 1;
        
        double mid = 0;
        if (len % 2 != 0) {
            mid = tt.get(m);
        } else {
            mid = (tt.get(m) + tt.get(M)) / 2.0;
        }
        
        System.out.println("The median of the two sorted arrays is: " + mid);
    }
}