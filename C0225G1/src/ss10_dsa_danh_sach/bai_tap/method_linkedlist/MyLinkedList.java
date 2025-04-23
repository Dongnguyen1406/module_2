package ss10_dsa_danh_sach.bai_tap.method_linkedlist;

public class MyLinkedList<E> {
    private Node head;
    private int numNodes;
    
    public MyLinkedList(){}

    public void addFirst(Object element) {
        Node newNode = new Node(element);
        newNode.setNext(head);
        head = newNode;
        numNodes++;
    }

    public void addLast(Object element) {
        Node newNode = new Node(element);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(newNode);
        }
        numNodes++;
    }

    public void add(int index, Object element) {
        if (index < 0 || index > numNodes) {
            System.out.println("Lỗi: Vị trí không hợp lệ.");
            return;
        }

        if (index == 0) {
            addFirst(element);
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.getNext();
            }

            Node newNode = new Node(element);
            newNode.setNext(temp.getNext());
            temp.setNext(newNode);
            numNodes++;
        }
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.getData() + " ");
            temp = temp.getNext();
        }
        System.out.println();
    }

    public Object get(int index) {
        if (index < 0 || index >= numNodes) {
            System.out.println("Lỗi: Chỉ mục không hợp lệ.");
            return null;
        }

        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.getNext();
        }

        return temp.getData();
    }

    public boolean remove(Object value) {
        if (head == null) return false;

        if (head.getData().equals(value)) {
            head = head.getNext();
            numNodes--;
            return true;
        }

        Node temp = head;
        while (temp.getNext() != null) {
            if (temp.getNext().getData().equals(value)) {
                temp.setNext(temp.getNext().getNext());
                numNodes--;
                return true;
            }
            temp = temp.getNext();
        }

        return false;
    }

    public int size() {
        return numNodes;
    }
}
