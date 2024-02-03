import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // 뽑을값
        List<Integer> list = new ArrayList<>();
        // 데크
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i=0; i<m; i++) {
            list.add(sc.nextInt());
        }
        for (int i=1; i<n+1; i++) {
            deque.offer(i);
        }
        int sum = 0;
        int num = 0;
        while (true) {
            for (int i=0; i<list.size(); i++) {
                if (list.get(i) > n/2) {
                    int temp = deque.pollLast();
                    deque.offerFirst(temp);
                    sum++;
                } else if(list.get(i) == deque.peekFirst()) {
                    num += deque.pollFirst();
                    break;
                } else {
                    int temp = deque.pollFirst();
                    deque.offerLast(temp);
                    sum++;
                }
            }
            if (num == list.stream().mapToInt(Integer::intValue).sum()) {
                break;
            };
        }
        System.out.println(sum);

    }
}
