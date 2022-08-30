package search;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class DFS {

    public static void searchDepthFirst(Node node) {
        Stack<Node> stack = new Stack<>();

        stack.push(node);

        while (!stack.isEmpty()) {
            Node next = stack.pop();

            System.out.println(next.data);

            for (Node child: next.children) {
                stack.push(child);
            }
        }
    }

    public static void searchBreadthFirst(Node node) {
        Queue<Node> queue = new LinkedList<>();

        queue.add(node);

        while (!queue.isEmpty()) {
            Node next = queue.poll();
            System.out.println(next.data);
            queue.addAll(next.children);
        }
    }

    private class Node {
        private int data;
        private List<Node> children = new ArrayList<Node>();
    }

}
