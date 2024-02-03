import java.util.*;

public class Q25416_Daeun_Kim {
//    static int[] array = {};
//    static int mCount = 0;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Queue<int[]> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        queue.offer(new int[]{n, 0});

        while(!queue.isEmpty()) {
            int[] cur = queue.poll();

            if (cur[0] < 0 || cur[0] > 100000) {
                continue;
            }

            if (cur[0] == k) {
                System.out.println(cur[1]);
                break;
            }

            if (!visited.contains(cur[0]+1)) {
                visited.add(cur[0]+1);
                queue.offer(new int[]{cur[0]+1, cur[1]+1});
            }
            if (!visited.contains(cur[0]-1)) {
                visited.add(cur[0]-1);
                queue.offer(new int[]{cur[0]-1, cur[1]+1});
            }
            if (!visited.contains(cur[0]*2)) {
                visited.add(cur[0]*2);
                queue.offer(new int[]{cur[0]*2, cur[1]+1});
            }

        }
//        System.out.println(mCount);

    }
}