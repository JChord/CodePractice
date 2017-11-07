/**
 * two way linked list
 */
public class DoubleLinkedList<T> {
    private Node<T> head = null;
    private Node<T> tail = null;
    private int size = 0;

    public void add(T item) {
        Node<T> newNode = new Node(item, tail, null);
        Node<T> oldTail = tail;
        tail = newNode;
        if (null == oldTail) {
            head = newNode;
        } else {
            oldTail.next = newNode;
        }
        size++;
    }

    public void add(int index, T item) {
        if (index < 0 || index > size) {
            return;
        }
        if (index == size) {
            add(item);
        } else {
            Node<T> target = find(index);
            Node<T> newNode = new Node<T>(item, target.pre, target);

            if (target.pre == null) {
                head = newNode;
            } else {
                target.pre.next = newNode;
            }
            target.pre = newNode;
            size++;
        }
    }

    public void delete(int index) {
        Node<T> target = find(index);
        delete(target);
    }

    public void delete(Node<T> node) {
        // 更改相邻前节点的后置
        if (node.pre == null) { // 删除的是头节点
            head = node.next;
        } else {
            node.pre.next = node.next;
        }

        // 更改相邻后节点的前置
        if (node.next == null) { // 删除的是尾节点
            tail = node.pre;
        } else {
            node.next.pre = node.pre;
        }
        size--;
    }

    public void put(int index, T item) {
        if (index < 0 || index > size) {
            return;
        }
        if (size == 0) {
            add(item);
        } else {
            Node<T> target = find(index);
            Node<T> newNode = new Node<T>(item, target.pre, target.next);

            if (target.pre == null) { // 替换的是头节点
                head = newNode;
            } else {
                target.pre.next = newNode;
            }

            if (target.next == null) { // 替换的是尾节点
                tail = newNode;
            } else {
                target.next.pre = newNode;
            }
        }
    }

    public T get(int index) {
        if (0 <= index  || index < size ) {
            return find(index).item;
        }
        return null;
    }

    private Node<T> find(int index) {
        if (index < (size >> 1)) {
            Node<T> node = head;
            for (int i=0; i<index; i++) {
                node = node.next;
            }
            return node;
        } else  {
            Node<T> node = tail;
            for (int i=size-1; i>index; i--) {
                node = node.pre;
            }
            return node;
        }
    }

    public void display() {
        for (int i=0; i<size; i++) {
            System.out.print(String.format("(%d=%d)<->", i, get(i)));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoubleLinkedList<Integer> doubleLinkedList = new DoubleLinkedList<>();
        doubleLinkedList.add(1);
        doubleLinkedList.add(2);
        doubleLinkedList.add(0,3);
        doubleLinkedList.add(4);
        doubleLinkedList.add(5);
        doubleLinkedList.add(6);
        doubleLinkedList.display();

        // 删除指定位置节点
        doubleLinkedList.delete(3);
        doubleLinkedList.display();

        // 替换指定位置节点
        doubleLinkedList.put(0,7);
        doubleLinkedList.display();
    }
}

class Node<T> {
    public T item;
    public Node<T> pre;
    public Node<T> next;

    public Node(T item, Node<T> pre, Node<T> next) {
        this.item = item;
        this.pre = pre;
        this.next = next;
    }
}
