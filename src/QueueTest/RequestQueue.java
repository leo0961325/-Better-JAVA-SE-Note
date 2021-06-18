package QueueTest;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class RequestQueue {

    interface Request {
        void execute();
    }


    public static void main(String[] args) {
        Queue<Request> requests = new LinkedList<>();
        offerRequestTo(requests);
        process(requests);

        }

    static void offerRequestTo(Queue<Request> requests) {
        // 模擬將請求加入佇列
        for (int i = 1; i < 6; i++) {
            requests.offer(
                    () -> System.out.printf("處理資料 %f%n", Math.random())
            );
        }
    }
    // 處理佇列中的請求
    static void process(Queue<Request> requests) {
        while(requests.peek() != null) {
            Request request = requests.poll();
            request.execute();

        }

    }





}
