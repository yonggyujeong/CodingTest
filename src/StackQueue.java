import sun.awt.image.ImageWatched;

import java.util.*;

public class StackQueue {

    public static void main(String[] args) {
        //Queue 는 인터페이스 이고, LinkedList는 그의 구현체이다.
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);

        System.out.println(queue);
        // 값을 꺼내서 확인
        queue.poll();
        queue.poll();
        queue.poll();
        System.out.println(queue);

        //값을 꺼내지 않고 확인만
        queue.peek();
        System.out.println(queue);

        System.out.println("---------------");
        // Stack은 클래스로 제공함
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.peek();
        System.out.println(stack);

        System.out.println("-----------------");
        // deque : offerFirst, offerLast 양방형
        Deque<Integer> deque = new LinkedList<>();
        deque.offerFirst(1);
        deque.offerFirst(2);
        deque.offerFirst(3);
        deque.offerLast(4);
        deque.offerLast(5);
        System.out.println(deque);
        deque.pollFirst();
        System.out.println(deque);

        Deque<Character> deuee = new LinkedList<>();
        stack.isEmpty();
        

    }
}
