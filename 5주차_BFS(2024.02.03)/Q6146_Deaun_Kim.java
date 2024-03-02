import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q6146_Deaun_Kim {
    static int[][] direction = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    static int[][] graph = new int[1002][1002];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int n = scanner.nextInt();
        graph[x+500][y+500] = 1;

        for (int i = 0; i < n; i++) {
            graph[scanner.nextInt()+500][scanner.nextInt()+500] = -1;
        }

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{500, 500});
        int[][] visited = new int[1002][1002];

        while (!queue.isEmpty()) {
            int[] now = queue.poll();

            if (graph[now[0]][now[1]] == 1) {
                System.out.println(visited[now[0]][now[1]]);
                return;
            }
            for (int[] dir : direction) {
                int dx = now[0] + dir[0];
                int dy = now[1] + dir[1];

                if (dx >=0 && dx < 1000 && dy >= 0 && dy < 1000 && graph[dx][dy] != -1 && visited[dx][dy]==0) {
                    visited[dx][dy] = visited[now[0]][now[1]] + 1;
                    queue.offer(new int[]{dx, dy});
                }
            }
        }
    }
}
