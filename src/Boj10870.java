import java.util.Scanner;

public class Boj10870 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(pivo(n));
    }

    private static int pivo(int n){
        if (n == 0 || n == 1){
            return n;
        }
        return pivo(n-1) + pivo(n-2);
    }
}
