package testinfo8010;

public class VendingMachineMain {
    public static void main(String[] args) {
        //VendingMachine 인스턴스 혹은 오브젝트를 선언
        //vendingMachine -> 참조변수
        VendingMachine vendingMachine = new VendingMachine();

        VendingMachine vendingMachine2 = new VendingMachine();

        String product = vendingMachine.getProduct(100);

        //static 메소드는 인스턴스를 생성하지않아도 사용가능하다. (인스턴스가 이미 메모리에 올라가져 있다.s)
        //static 메소드는 레퍼런스 변수로 접근하지 않는 것이 관례
        // 잘못된 예시 -> 레퍼런스 변수로 명시해준다.s
        vendingMachine.getVer();
        // 옳은 예시 -> 클래스 명으로 명시해준다.
        VendingMachine.getVer();

        System.out.println(product);
    }

}
