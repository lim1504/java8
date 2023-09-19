package java0919;

@FunctionalInterface
interface MyFunction2 {
    void myMethod();
}

/**
 * 함수형 인터페이스는 함수형인터페이스 형태로 형변환은 가능하다.
 * Object 타입으로 형변환은 불가하다.
 * 함수형 인터페이스 내에 인터페이스는 하나가 존재하기 때문에 형변환이 가능하다. (직접구현하지않아도 형변환 가능)
 */
public class LambdaEx2 {
    public static void main(String[] args) {
        MyFunction2 f = () -> {}; // MyFunction f = (MyFunction) (() -> {}); 과 동일
        Object obj = (MyFunction) (() -> {});
        String str = ((Object) (MyFunction) (() -> {})).toString(); //굳이 형변환 하자면...

        System.out.println(f);
        System.out.println(obj);
        System.out.println(str);

//        System.out.println(() -> {}); //에러. 람다식은 Object 형식으로 형변환 불가
        System.out.println((MyFunction) (() -> {}));
//        System.out.println((MyFunction) (() ->{}).toString()); //에러.
        System.out.println(((Object) (MyFunction) (() -> {})).toString());
    }
}
