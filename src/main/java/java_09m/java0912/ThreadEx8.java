package java_09m.java0912;

public class ThreadEx8 {
    public static void main(String[] args) {
        //main 메소드는 항상 우선순위 5이므로, 자연스레 main 스레드에 생성된 스레드는 우선순위 5를 상속받는다.
        ThreadEx8_1 th1 = new ThreadEx8_1();
        ThreadEx8_2 th2 = new ThreadEx8_2();

        //우선순위를 변경해주면 th2 스레드는 5 -> 7로 우선순위가 변경된다. (순위가 높을수록 우선순위가 높다.)
        th2.setPriority(7);

        System.out.println("Priority th1 :" + th1.getPriority());
        System.out.println("Priority th2 :" + th2.getPriority());
        th1.start();
        th2.start();
    }
}

class ThreadEx8_1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print("-");
            for (int j = 0; j < 10000000; j++);
        }
    }
}

class ThreadEx8_2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print("|");
            for (int j = 0; j < 10000000; j++);
        }
    }
}