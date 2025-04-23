package ss10_dsa_danh_sach.bai_tap.method_linkedlist;

public class Node {
    private Node next;
    private Object data;
    
    public Node(Object data){
        this.data = data;
    }
    
    public Object getData(){
        return data;
    }
    
    public Node getNext(){
        return next;
    }
    
    public void setNext(Node next){
        this.next = next;
    }
}
