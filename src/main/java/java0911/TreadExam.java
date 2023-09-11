package java0911;

public class TreadExam {
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

        test.start();
        test2.start();

        System.out.println("end");
    }
}

class ThreadExam1 extends Thread {

    private String str;

    public ThreadExam1(String str) {
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

class ThreadExam2 extends Thread {
    private String str;

    public ThreadExam2(String str) {
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