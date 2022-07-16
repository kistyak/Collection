package multithreading;

public class Ex1 {
    public static void main(String[] args) {

        // Многопоточность - это принцип построения программы,
        // при котором несколько блоков кода могут выполняться одновременно.

        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }
}

class MyThread1 extends Thread{
    public void run(){
        for (int i = 1; i <= 1000 ; i++) {
            System.out.println(i);
        }
    }
}
class MyThread2 extends Thread{
    public void run(){
        for (int i = 1000; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
