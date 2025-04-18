package ss10_dsa_danh_sach.bai_tap.method_arraylist;

import java.util.Arrays;

public class MyList<E> { // <E> để biết truyền vào là đối tượng gì
    private int size = 0; // số lượng phần tử hiện tại có trong arraylist
    private static final int DEFAULT_CAPACITY = 10; // sức chứa arraylist có bao nhiêu phần tử
    public Object[] elements; // mảng chứa phần tử của arraylist 

    public MyList() { // sức chứa mặc định khi khởi tạo constructor không có tham số
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) { // sức chứa truyền vào khi khởi tạo constructor có tham số
        if (capacity >= 0){
            elements = new Object[capacity];
        }else {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
    }

    public int size(){ // method trả về số lượng phần tử
        return this.size;
    }

    public void clear(){
        size = 0;
        for (int i =0; i < elements.length; i++){
            elements[i] = null;
        }
    }

    public boolean add(E element){ // method add 1 phần tử vào mylist
        if(elements.length == size){
            this.ensureCapacity( 5);
        }
        elements[size] = element; // ví dụ mảng có size là 0 thì sẽ gáng element vào vị trí 0
        size++;
        return true;
    } // nhưng bị vấn đề đó là sức chứa chỉ có 10 nên khi add quá thì sẽ bị lỗi

    public void ensureCapacity(int minCapacity){
        if (minCapacity >= 0){
            int newSize = this.elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newSize);
        } else {
            throw new IllegalArgumentException("minCapacity: " + minCapacity);
        }
    }

    public void add(E element ,int index) { // method add element theo index mong muốn
        if(index > elements.length){
            throw new IllegalArgumentException("index: " + index);
        } else if(elements.length == size){
            this.ensureCapacity(5);
        } 
        if (elements[index] == null){
            elements[index] = element;
        }else {
            for (int i = size+1; i >= index; i--){
                elements[i] = elements[i-1];
            } 
            elements[index] = element;
            size++;
        }
    }

    public E get(int index) { // method lấy 1 element tại vị trí index
        return (E) elements[index];
    }
    public int indexOf(E element){
        int index = -1;
        for(int i =0; i <size; i++){
            if (this.elements[i].equals(element)){
                return i;
            }
        }
        return index;
    }
    
    public boolean contains (E element){
        return this.indexOf(element) >= 0;
    }
    
    public MyList<E> clone(){
        MyList<E> v = new MyList<>();
        v.elements = Arrays.copyOf(this.elements, this.size);
        v.size = this.size;
        return v;
    }
    
    public E remove(int index){ // xóa 1 element tại vị trí index
        if(index < 0 || index > elements.length){
            throw new IllegalArgumentException("Error index: " + index);
        }
        E element = (E) elements[index];
        for (int i = index; i< size-1; i++){
            elements[i] = elements[i+1];
        }
        elements[size-1]= null;
        size--;
        return element;
    }
}
