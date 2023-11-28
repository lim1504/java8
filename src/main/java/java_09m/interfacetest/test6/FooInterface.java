package java_09m.interfacetest.test6;

interface FooInterface extends InterfaceA, InterfaceB {
    int MAX = 100; // public static final int MAX = 100와 동일

    void Attack(); // public abstract void Attack와 동일

    static void work(String unit){
        System.out.println(unit + "이 일을합니다.");
    }

    default void sleep(String unit){
        System.out.println(unit + "이 잠을잡니다.");
    }

}
