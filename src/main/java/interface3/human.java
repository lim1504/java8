package interface3;

class human extends GroundUnit{
    human() {
        super(100);
        hitPoint = MAX_HP;
    }

    public String toString() {
        return "human";
    }
}
