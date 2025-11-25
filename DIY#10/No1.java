import java.util.Scanner;
import java.util.HashMap;

public class No1 {
    public static void main(String[] args ){
        Scanner scan = new Scanner(System.in);
        String key = "";
        int value = 0;
        
        HashMap<String, Integer> ft = new HashMap<String, Integer>();
        while (true) {
            key = scan.next();
            
            if (key.equals("0")) break;
            
            value = scan.nextInt();
            ft.put(key, ft.getOrDefault(key, 0) + value);
        }
        //after stop input get which one need to compute
        String what = scan.next();
        int sum = ft.getOrDefault(what, 0);
        System.out.println(sum);
    }
}