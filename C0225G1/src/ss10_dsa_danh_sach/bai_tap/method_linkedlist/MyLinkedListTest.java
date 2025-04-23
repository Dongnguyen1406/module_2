package ss10_dsa_danh_sach.bai_tap.method_linkedlist;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        list.addFirst("C");
        list.addFirst("B");
        list.addFirst("A");
        list.add(1, "X");

        System.out.print("Danh sách: ");
        list.printList(); // A X B C

        System.out.println("Phần tử tại vị trí 2: " + list.get(2)); // B

        list.remove("X");
        System.out.print("Danh sách sau khi xoá 'X': ");
        list.printList(); // A B C

        System.out.println("Kích thước: " + list.size());
    }
}
