package interface3;

class Scv extends GroundUnit implements Repairable{
    Scv() {
        super(60);
        hitPoint = MAX_HP;
    }

    void repair(Repairable r) {
        if (r instanceof Unit){
            Unit u = (Unit) r;
            while (u.hitPoint != u.MAX_HP){
                u.hitPoint++;
            }

            System.out.println(u.toString() + "수리완료");
        }
    }
}
