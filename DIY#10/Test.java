import java.util.HashSet;
import java.util.Scanner;
import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        HashSet<String> fruits = new HashSet<String>();
        fruits.add("mango");
        fruits.add("Water melon");
        for (String f : fruits) {
            System.out.println(f);
        }
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1  ,"hana");
        map.put(2, "YUMI");
        map.put(3, "PP");
        map.put(4, "UIS");
        System.out.println(map);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 4) {
            System.out.println(map.get(4));
        } else {
            System.out.println("Nah");
        }
    }
}
