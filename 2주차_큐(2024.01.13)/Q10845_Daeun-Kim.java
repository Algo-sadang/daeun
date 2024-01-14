import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        Deque queue = new ArrayDeque<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            String order = st.nextToken();
            switch (order) {
                case "push":
                    int value = Integer.parseInt(st.nextToken());
                    queue.offer(value);
                    break;
                case "front":
                    if ( queue.peek() == null) {
                        System.out.println(-1);
                    } else {
                        System.out.println( queue.peek());
                    }
                    break;
                case "back":
                    if ( queue.peekLast() == null) {
                        System.out.println(-1);
                    } else {
                        System.out.println(queue.peekLast());
                    }
                    break;
                case "size":
                    System.out.println(queue.size());
                    break;
                case "empty":
                    if (queue.isEmpty()) {
                        System.out.println(1);
                    } else {
                        System.out.println(0);
                    }
                    break;
                case "pop":
                    if (queue.peekFirst() != null) {
                        System.out.println(queue.pollFirst());
                    } else {
                    System.out.println(-1);
                }
                    break;

            }
        }
    }
}
