package java0912;

import java.util.ArrayList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * wait, notify 예제
 *
 * @author cslim
 */
public class ThreadWaitEx1 {

    public static void main(String[] args) throws Exception {
        Table table = new Table();
        new Thread (new Cook (table), "COOK1").start ();
        new Thread (new Customer (table, "donut"), "CUST1").start();
        new Thread (new Customer (table, "burger"), "CUST2").start();

        Thread.sleep(2000);
        System.exit (0);
    }
}

class Customer implements Runnable {
    private Table table;
    private String food;

    public Customer(Table table, String food) {
        this.table = table;
        this.food = food;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {}
            String name = Thread.currentThread().getName();

            table.remove(food);
            System.out.println(name + " ate a " + food);
        }
    }
}

class Cook implements Runnable {
    private Table table;

    public Cook(Table table) {
        this.table = table;
    }

    public void run() {
        while (true) {
            int idx = (int) (Math.random() * table.disNum());
            table.add(table.dishNames[idx]);

            try{
                Thread.sleep(10);
            } catch (InterruptedException e) {}
        }
    }
}

class Table {
    /**
     * lock 요소 추가
     */
    private ReentrantLock lock = new ReentrantLock();
    private Condition forCook = lock.newCondition();
    private Condition forCust = lock.newCondition();
    String[] dishNames = {"donut", "donut", "burger"};
    final int MAX_FOOD = 6;
    private ArrayList<String> dishes = new ArrayList<String>();

    public synchronized void add(String dish) {
        lock.lock();
        try {
            while (dishes.size() >= MAX_FOOD) {
                String name = Thread.currentThread().getName();
                System.out.println(name + " is waiting");
                try {
//                wait();
//                Thread.sleep(500);
                    forCook.await(); // cook스레드는 기다리게한다.
                } catch (InterruptedException e) {
                }
            }
            dishes.add(dish);
            //notify();
            forCust.signal(); // CUST 스레드를 깨운다.
            System.out.println("Dishes : " + dishes.toString());
        } finally {
            lock.unlock();
        }

    }

    public void remove(String dishName) {
        lock.lock();
        String name = Thread.currentThread().getName();

        try{
            while (dishes.size() == 0) {
                System.out.println(name + " is waiting.");
                try {
//                    wait();
//                    Thread.sleep(500);
                    forCust.await();
                } catch (InterruptedException e) {
                }
            }

            while (true) {
                for (int i = 0; i < dishes.size(); i++) {
                    if (dishName.equals(dishes.get(i))) {
                        dishes.remove(i);
//                        notify();
                        forCook.signal();
                        return;
                    }
                }
                try {
                    System.out.println(name + "is waiting.");
                    forCust.await();
//                    wait();
//                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }
        } finally {
            lock.unlock();
        }
    }
    public int disNum() {
        return dishNames.length;
    }
}
