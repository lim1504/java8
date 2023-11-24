package java1124;

public class InterfaceTest {
    public void main(String[] args) {

        Inter i = new InterTest();

    }

    void methodInter(Inter a) {

    }

    Inter methodInterTwo() {

        return new InterTest();
    }
    class InterTest extends InterTestExtension implements Inter {
        @Override
        public void musicIng() {

        }

        @Override
        public void musicStart() {

        }

        @Override
        public void musicStop() {

        }

        @Override
        public void singing() {

        }

        @Override
        void add() {
            super.add();
        }

        @Override
        void delete() {
            super.delete();
        }
    }

    class InterTestExtension {
        void add () {}

        void delete () {}
    }

    interface Inter extends CDPlayer, Listener{
        default void pass () {
            System.out.println("일반 메소드와 같이 활용가능");
        }

        static void pass2() {
            System.out.println("static 메소드도 마찬가지다.");
        }
    }

    interface CDPlayer {
        void musicIng();
    }

    interface Listener {
        void musicStart();
        void musicStop();
        void singing();
    }
}
