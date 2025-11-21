import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class No3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // int[] ar = new int[100];
        // int index = 0;
        ArrayList<Integer> ar = new ArrayList<>();
        
        while (true) {
            int input = scan.nextInt();
            if (input == -1) break;
            ar.add(input);
        }
        // System.out.print(ar);
        Collections.sort(ar);
        for (int i = 0; i < ar.size(); i++) {
            System.out.print(ar.get(i) + " ");
        }
        System.out.println();
        Collections.reverse(ar);
        for (int i = 0; i < ar.size(); i++) {
            System.out.print(ar.get(i) + " ");
        }
    }
}