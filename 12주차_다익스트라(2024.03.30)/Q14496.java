import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q14496 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] graph = new int[n+1][n+1];
        for (int i=0; i<m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph[x][y] = 1; graph[y][x] = 1;
        }
        int[] visited = new int[n+1];
        visited[a] = 1;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{a, 0});
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            if (curr[0]==b) {
                System.out.println( curr[1]);
                return;
            }
            for (int i=1; i<n+1; i++) {
                if (curr[0]==i) {
                    continue;
                }
                if (visited[i]==0 && graph[curr[0]][i] == 1) {
                    queue.add(new int[]{i, curr[1]+1});
                    visited[i] = 1;
                }
            }
        }
        System.out.println(-1);
    }
}
