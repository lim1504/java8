package dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 프록시 클래스를 선언하지 않고, 동적으로 내가 구현한 프록시 인터페이스 구현체 정보의 행위를 출력할 수 있다.
 * => 동적 프록시
 */
public class DproxyExemple {
    public static void main(String[] args) {
        // 실제 생성할 인스턴스 정보 생성
        ProxyInterface realObj = new RealProxyInterface();

        // 동적 프록시 생성
        ProxyInterface proxy = (ProxyInterface) Proxy.newProxyInstance(
                ProxyInterface.class.getClassLoader(),
                new Class[]{ProxyInterface.class},
                new MyInvocationHandler(realObj)
        );

        proxy.doSomething();
    }
}

/**
 * 프록시 할 인터페이스 정보
 */
interface ProxyInterface {
    void doSomething();
}

/**
 * InvocationHandler 인터페이스 구현
 * 동적 프록시를 생성한 경우, target 호출 전 후로 사용자 정의 동작을 추가할 수 있다. (invoke)
 *
 */
class MyInvocationHandler implements InvocationHandler {
    private final ProxyInterface proxyInterface;

    public MyInvocationHandler(ProxyInterface proxyInterface) {
        this.proxyInterface = proxyInterface;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Before invoking method : " + method.getName());
        Object res = method.invoke(proxyInterface, args);
        System.out.println("After invoking method : " + method.getName());

        return res;
    }
}

/**
 * 프록시 인터페이스를 구현한 구현체
 */
class RealProxyInterface implements ProxyInterface {
    @Override
    public void doSomething() {
        System.out.println("Real Object");
    }
}

