package java_11m.java1115;

public class ConTestMain {
    public static void main(String[] args) {
        Test t = new Test("one", 5);

        t.displayInfo();

        Test t2 = new Test("two");
    }
}


class Test {
    String key;
    int value;

    public Test(String key, int value) {
        this.key = key;
        this.value = value;
    }

    public Test(String key) {
        this.key = key;
    }

    public void displayInfo() {
        System.out.println("key: " + key + " value: " + value);
    }

}
