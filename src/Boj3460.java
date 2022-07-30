import java.util.Scanner;

public class Boj3460 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        sc.nextLine();
        String input[] = sc.nextLine().split(" ");
        for (int i = 0 ; i < tc ; i++) {
            int n = Integer.parseInt(input[i]);
            int na  = 0;
            int cnt = 0;
            while (n != 1){
                na = n % 2;     // 나머지
                n = n / 2;      // 몫
                //System.out.println(na+" "+n);
                if (na == 1){
                    System.out.print(cnt + " ");
                }
                cnt ++;
            }
            if (n == 1) {
                System.out.print(cnt);
                System.out.println();
            }
        }
    }
}

