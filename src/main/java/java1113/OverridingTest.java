//package java1113;
//
//import org.objectweb.asm.ClassAdapter;
//public class OverridingTest {
//    public static void main(String[] args) {
//        ClassInfo1 c1 = new ClassInfo1();
//        c1.methodInfo();
//
//        ClassInfo2 c2 = new ClassInfo2();
//        c2.methodInfo();
//    }
//}
//
//class ClassInfo1 {
//
//    public void methodInfo () {
//        System.out.println("Supper Class -> Method Call");
//    }
//}
//
//class ClassInfo2 extends ClassInfo1{
//
//    @Override
//    public void methodInfo() {
//        System.out.println("Sub Class -> Super Class Method Call");
//    }
//}
