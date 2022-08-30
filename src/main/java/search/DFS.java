package search;

import java.util.ArrayList;
import java.util.List;
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

    private class Node {
        private int data;
        private List<Node> children = new ArrayList<Node>();
    }

}
