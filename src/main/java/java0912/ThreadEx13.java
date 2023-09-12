package java0912;

import javax.swing.*;

public class ThreadEx13 {
    public static void main(String[] args) {
        ThreadEx13_1 th = new ThreadEx13_1();
        th.start();

        String input = JOptionPane.showInputDialog("값 입력");
        System.out.println("입력하신 값은 :" + input + "입니다.");
        th.interrupt(); // 사용자가 input 하기 전까지는 계속해서 while문 실행
        System.out.println("is Interrupted :" + th.isInterrupted());
    }
}

class ThreadEx13_1 extends Thread {
    @Override
    public void run() {
        int i = 10;

        while (i != 0 && !isInterrupted()) { // 값이 false에는 지속실행, 값 입력 후, interrupt true로 변경시, 조건문 종료
            System.out.println(i--);
//            for (long x = 0; x<2500000000L; x++); // 일종의 지연효과
            try{
                //sleep인 경우, 카운트가 멈추지않는다.
                //sleep에서 InterruptedException이 발생했기 때문이다.
                //멈춰있는 동안, Interrupt을 호출하면, 예외가 발생하고 상태값은 false로 초기화된다.
                //이를 막기위해 catch문에 interrput을 추가해줘야한다.
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                interrupt(); // 상태값이 자동으로 false로 초기화되기 때문에, 추가해줘야함.
            }

        }
        System.out.println("종료");
    }
}
