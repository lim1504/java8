package java_09m.interface3;

public class RepairTest {

    public static void main(String[] args) throws Exception {
        Tank tank = new Tank();
        DropShip dropShip = new DropShip();
        human hu = new human();
        Scv scv = new Scv();

        scv.repair(tank);
        scv.repair(dropShip);
        //scv.repair(human);
    }
}
