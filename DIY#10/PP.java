import java.util.Scanner;
import java.util.HashMap;

public class PP {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String ft = "";
        int n;
        HashMap<String, Integer> map = new HashMap<>();

        while (true) {
            ft = scan.next();
            if (ft.equals("0")) break;
            n = scan.nextInt();
            map.put(ft, map.getOrDefault(ft, 0) + n);
        }
        String what = scan.next();
        int sum = map.getOrDefault(what, 0);
        System.out.println(sum);
    } 
}
