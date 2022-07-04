package datastructure.hash;

import java.util.ArrayList;
import java.util.List;

public class HashTable<T> {

    private static final int DEFAULT_HASH_SIZE = 10;

    private final List<Node<T>> arrays;
    private int currentSize = DEFAULT_HASH_SIZE;

    public HashTable(int size) {
        if (size != 0) {
            this.arrays = new ArrayList<>(size);
            this.currentSize = size;
            init(size);
            return;
        }
        init(size);
        this.arrays = new ArrayList<>(DEFAULT_HASH_SIZE);
    }

    private void init(int growSize) {
        for (int i = 0; i < growSize; i++) {
            this.arrays.add(null);
        }
    }

    public T getData(int hash) {
        Node<T> node = arrays.get(moduloOperation(hash));

        if (node.data.hashCode() == hash) {
            return node.data;
        }

        return node.findSameHash(hash);
    }


    public void setData(T data) {
        final int key = getIndex(data);
        Node<T> preNode = arrays.get(key);

        System.out.println("Key : " + key);

        /*
         * hashCollision
         */
        if (isCollision(preNode)) {
            preNode.connect(new Node<>(data));
            return;
        }

        arrays.set(key, new Node<>(data));
    }

    private boolean isCollision(Node<T> value) {
        return value != null;
    }

    public int getSize() {
        return arrays.size();
    }

    private int getIndex(T data) {
        return moduloOperation(getHash(data));
    }

    /**
     * 사실 이렇게 하는게 별로긴 한데, 어차피 알고 있는게 중요한거니깐..
     * @param hash hash 값
     * @return mod 연산이 적용된 값.
     */
    private int moduloOperation(int hash) {
        if (hash < 0) {
            hash *= -1;
        }

        return hash % currentSize;
    }

    private int getHash(T data) {
        return data.hashCode();
    }

    private static class Node<T> {

        private final T data;
        private Node<T> tail;

        public Node(T data) {
            this.data = data;
            this.tail = null;
        }

        public void connect(Node<T> data) {
            if (this.tail != null) {
                this.tail.connect(data);
                return;
            }
            this.tail = data;
        }

        public T getData() {
            return data;
        }

        public T findSameHash(int hash) {
            if (this.tail != null && this.tail.hashCode() == hash) {
                return this.tail.data;
            }

            if (this.tail != null && this.tail.hashCode() != hash) {
                return this.tail.findSameHash(hash);
            }

            return null;
        }
    }

}
