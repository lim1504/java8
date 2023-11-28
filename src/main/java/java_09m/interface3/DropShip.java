package java_09m.interface3;

class DropShip extends AirUnit implements Repairable{
    DropShip() {
        super(220);
        hitPoint = MAX_HP;
    }
    public String toString(){
        return "DropShip";
    }
}
