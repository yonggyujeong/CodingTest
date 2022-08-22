import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Stream;

public class Boj10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine(); // next와 nextline 섞어쓸떄
        String[] input = sc.nextLine().split(" ");

        // 숫자화
        int[] inputToInt = new int[N];
        for(int i = 0; i < N; i++){
            inputToInt[i] = Integer.parseInt(input[i]);
        }
        // 정렬
        Arrays.sort(inputToInt);
        // 최소 최대
        System.out.print(inputToInt[0]+ " " + inputToInt[N-1]); // -1인덱스 접근도 안됨
    }
}
