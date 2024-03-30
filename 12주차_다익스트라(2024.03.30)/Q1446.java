import java.util.*;

public class sol2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); int d = sc.nextInt(); // 지름길의 개수, 고속도로의 길이
        List<int[]>[] graph = new ArrayList[d+1];
        for (int i = 0; i < d+1; i++) {
            graph[i] = new ArrayList<>();
        }
        boolean[] visited = new boolean[d + 1];
        int[] dist = new int[d + 1];
        int INF = Integer.MAX_VALUE;
        int start = 0;
        Arrays.fill(dist, INF);
        dist[start] = 0;

        // 지름길의 시작위치, 도착위치, 길이
        for (int i=0; i<n; i++) {
            int s = sc.nextInt(); int e = sc.nextInt(); int l = sc.nextInt();
            if (e > d) {
                continue;
            }
            graph[s].add(new int[]{e, l});
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return Integer.compare(a[0], b[0]);
            }
        });
        // 거리, 위치
        pq.offer(new int[]{0, start});
        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            if (visited[curr[1]]) continue;
            visited[curr[1]] = true;

            for(int[] next : graph[curr[1]]) {
                if(dist[next[0]] > dist[curr[1]]+ next[1]) {
                    dist[next[0]] = dist[curr[1]] + next[1];

                    pq.offer(new int[]{next[0], dist[next[0]]});
                }
            }

        }
        System.out.println(dist[d]);

    }
}
