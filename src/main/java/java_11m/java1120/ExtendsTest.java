package java_11m.java1120;

public class ExtendsTest {

    public static void main(String[] args) {

    }
}

class Animal {
    public String working() {

        return "4발로 걷습니다.";
    }
}

class Lion extends Animal {
    public Lion() {
        super();
    }

    @Override
    public String working() {
        return "사자가" + super.working();
    }

    public String eat() {
        return "육식을 합니다";
    }
}

class Rabbit extends Animal {
    @Override
    public String working() {
        return "토끼가" + super.working();
    }

    public String eat() {
        return "채식을 합니다.";
    }
}
