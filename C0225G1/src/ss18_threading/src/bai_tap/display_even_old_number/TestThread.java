package bai_tap.display_even_old_number;

public class TestThread {
    public static void main(String[] args) {
        EvenThread even = new EvenThread();
        OldThread old = new OldThread();

        old.start();
        even.start();
    }

    // mở rộng với method join() cho phép xuất các số lẻ trước mới đến các số chẵn.
//    public static void main(String[] args) {
//        EvenThread even = new EvenThread();
//        OldThread old = new OldThread();
//
//        old.start();
//        try{
//            old.join();
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }
//        even.start();
//    }
}
