package java_09m.java0911;

public class TreadExam2 {
    public static void main(String[] args) {

//        for (int i = 0; i < 10; i++) {
//            System.out.println("*");
//
//            try{
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//
//        for (int j = 0; j < 10; j++) {
//            System.out.println("++");
//
//            try{
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
        String name = Thread.currentThread().getName();
        System.out.println("name : " + name);
        System.out.println("start");

        ThreadExam1 test = new ThreadExam1("*");
        ThreadExam1 test2 = new ThreadExam1("+");

        Thread test3 = new Thread(test);
        Thread test4 = new Thread(test2);

        test3.start();
        test4.start();
        System.out.println("end");
    }
}

class ThreadExam2_1 implements Runnable {

    private String str;

    public ThreadExam2_1(String str) {
        this.str = str;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(str);

            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class ThreadExam2_2 implements Runnable {
    private String str;

    public ThreadExam2_2(String str) {
        this.str = str;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(str);

            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}