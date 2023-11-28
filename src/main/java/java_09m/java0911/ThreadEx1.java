package java_09m.java0911;

public class ThreadEx1 {
    public static void main(String[] args) {
        ThreadEx1_1 t1 = new ThreadEx1_1(); // 스레드 자손클래스의 인스턴스를 생성

        Runnable r = new ThreadEx1_2(); // Runnable을 구현한 클래스의 인스턴스 생성
        Thread t2 = new Thread(r); // Thread 생성자에 주입

        //실행대기상태 -> 자신의 차례가 오면 실행
        //실행중인 스레드가 없다면, 곧바로 실행
        //종료된 스레드는 다시 재실행이 불가하다.
        t1.start();
        t2.start();
    }
}

class ThreadEx1_1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(getName());
        }
    }
}

class ThreadEx1_2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            //실행중인 스레드 반환
            System.out.println(Thread.currentThread().getName());
        }
    }
}


