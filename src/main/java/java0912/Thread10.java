package java0912;

public class Thread10 implements Runnable {
    static boolean autoSave = false;
    public static void main(String[] args) {
        Thread t = new Thread(new Thread10());
        t.setDaemon(true); //선언하지 않으면, 무한실행
        t.start();

        for (int i = 1; i <= 10; i++) {
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);

            if(i == 5)
                autoSave = true;
        }

        System.out.println("종료");
    }

    @Override
    public void run() {
        while (true) {
            try{
                Thread.sleep(3* 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(autoSave) {autoSave();}
        }
    }

    public void autoSave () {
        System.out.println("자동저장");
    }
}
