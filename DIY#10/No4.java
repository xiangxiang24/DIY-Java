import java.util.Scanner;

public class No4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        No4 f = new No4();
        long num = scan.nextLong();
        if (num < 0) {
            System.out.println("Invalid Number!");
            return;
        }
        System.out.println(f.fac(num));
    }
    public long fac(long n) {
        if (n == 0) {
            return 1;
        } else {
            return n * fac(n-1);
        }
    }
}
