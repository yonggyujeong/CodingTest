import java.util.Arrays;
import java.util.Scanner;

public class Boj2460 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] people = new int[10];
        for(int i = 0; i < 10; i++){
           int out =  sc.nextInt();
           int in = sc.nextInt();
           if(i == 0){
               people[0] = in;
           }else{
               people[i] = people[i-1] - out + in;
           }
        }
        System.out.print(Arrays.stream(people).max().getAsInt());
    }
}

