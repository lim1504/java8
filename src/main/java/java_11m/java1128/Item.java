package java_11m.java1128;

/**
 * OOP 예제
 */
class Item {
    public String Book;
    public int price;
    public int number;

    public Item(String book, int price, int number) {
        Book = book;
        this.price = price;
        this.number = number;
    }

    public int SellingBooks() {
        return this.price * this.number;
    }

}

/**
 * DOP 예제
 */
class DataItem {
    private static final int IDX = 1000000;
    private int currentIndex = 0;

    public String[] book = new String[IDX];
    public int[] price = new int[IDX];
    public int[] number = new int[IDX];

    public void add (String book, int price, int number) {
        this.book[currentIndex] = book;
        this.price[currentIndex] = price;
        this.number[currentIndex] = number;

        currentIndex++;
    }

    public int getMaxSellingBooks() {

        int maxPrice = 0;

        for (int i = 0; i < this.currentIndex; i++) {
            if (maxPrice <= this.price[i] * this.number[i]) {
                maxPrice = this.price[i] * this.number[i];
            }
        }

        return maxPrice;
    }
}

class BooksCompMain {
    static int MAXPRICE = 0;
    public static void main(String[] args) {

        int forNum = 1000000;

        Item[] test1 = new Item[forNum];
        DataItem test2 = new DataItem();

        for (int i = 0; i < forNum; i ++) {
            int price = (int) (Math.random() * 1000) + 1;
            int number = (int) (Math.random() * 1000) + 1;
            test1[i] = new Item("Book" + i, price, number);
            test2.add("Book" + 1, price, number);

        }

        System.out.println("Ready Comple");

        MAXPRICE = 0;

        //객체지향 테스트
        long start = System.nanoTime();


        for (int i = 0; i < forNum; i ++) {
            if (MAXPRICE <= test1[i].SellingBooks()) {
                MAXPRICE = test1[i].SellingBooks();
            }
        }

        long end = System.nanoTime();
        System.out.println("maxPrice - oop : " + MAXPRICE);


        //데이터지향 테스트
        MAXPRICE = 0;
        long start2 = System.nanoTime();

        MAXPRICE = test2.getMaxSellingBooks();

        long end2 = System.nanoTime();

        System.out.println("maxPrice - dop : " + MAXPRICE);

        System.out.println("OOP time : " + (end - start));
        System.out.println("DOP time : " + (end2 - start2));
    }
}
