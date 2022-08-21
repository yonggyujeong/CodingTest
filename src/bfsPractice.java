import java.util.LinkedList;
import java.util.Queue;

public class bfsPractice {
    public static void main(String[] args) {
        int[][] graph = {{}, {2,3,8}, {1,6,8}, {1,5}, {5,7}, {3,4,7}, {2}, {4,5}, {1,2}};

        boolean[] visited = new boolean[9];

        String result = bfs(1, graph, visited);
        System.out.print(result);
    }

    static String bfs(int start, int[][] graph, boolean[] visited){
        StringBuilder sb = new StringBuilder();
        Queue<Integer> queue = new LinkedList<Integer>();

        // 시작노드
        queue.offer(start);
        visited[start] = true;

        // 큐가 빌때까지 반복
        while(!queue.isEmpty()){
            int idx = queue.poll();
            sb.append(idx + "->");

            for (int i = 0 ; i < graph[idx].length ; i++){
                int node = graph[idx][i];
                if (!visited[node]){
                    visited[node] = true;
                    queue.offer(node);
                }
            }
        }
        return sb.toString();
    }
}
