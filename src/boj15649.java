import java.util.Scanner;

public class boj15649 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        boolean[] visited = new boolean[N];
        int[] result = new int[M];
        dfs(visited, result, 0, M, N);
    }


    private static void dfs(boolean[] visited ,int[] result, int depth, int M, int N){
        // print
        if (depth == M){
            for(int r : result){
                System.out.print(r + " ");
            }
            System.out.println();
            return; // 탐색 마지막 노드
        }

        // for
        for(int i = 0; i < N ; i++){
            if(!visited[i]){
                result[depth] = i+1;
                visited[i] = true;
                dfs(visited, result, depth+1, M, N);
                visited[i] = false;
            }
        }

    }
}

