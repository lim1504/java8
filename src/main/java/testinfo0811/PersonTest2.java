package testinfo0811;

public class PersonTest2 {
    public static void main(String[] args) {
        System.out.println(Person.count);
        Person.printCount();

//        사용 불가 why?
//        System.out.println(Person.name);
//        Person.printName();


        Person person = new Person();
        person.name = "홍길동";

        person.printName();
        person.printCount();

        Person.count++;

        person.printCount();
    }
}
