package abstracttest;

abstract class Carmap {

    String car;
    int x;
    abstract String opendoor(String car);
    abstract String closedoor(String car);

    abstract String move(String car, int x);

    abstract String stop(String car, int x);

    void init(String car, int x){
        this.car = "";
        this.x = 0;
    }
}
