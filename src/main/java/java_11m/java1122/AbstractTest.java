package java_11m.java1122;

public class AbstractTest {

    public class Sonata extends CarPlay{
        Sonata() {
            super("Sonata");
        }
        @Override
        void move() {
            System.out.println(this.model + "이 시속 300km로 움직이고 있습니다.");
        }

        @Override
        void stop() {
            System.out.println(this.model + "이 정지했습니다.");
        }

        @Override
        void start() {
            System.out.println(this.model + "이 출발했습니다.");
        }

        @Override
        void number(int order) {
            System.out.println(this.model+ "은 " +order+ " 번째 입니다.");
        }
    }
    public abstract class CarPlay {
        String model;
        int modelCnt;
        CarPlay(String model) {
            this.model = model;
            this.modelCnt++;
        }

        abstract void move();

        abstract void stop();

        abstract void start();

        void carOrder() {
            number(this.modelCnt);
        }

        abstract void number (int order);
    }

}
