package java_08m.testinfo0822;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * List
 *
 * @author cslim
 */
public class Collection01 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");

        //아직 타입 정보가 정해지지 않아, 명시적 형변환 실시
        String str1 = (String) list.get(0);
        String str2 = (String) list.get(1);
        String str3 = (String) list.get(2);

        list.contains("a");
        list.contains("d");

        //지네릭스 활용해 String 타입만 담기는 컬렉션 정보 선언
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("a");
        list2.add("b");
        list2.add("c");

        //컬렉션 선언시 상위 interface 객체를 기준으로 인스턴스 타입을 지정하는 것이 옳은 방식.
        List<String> list3 = new ArrayList<>();


        //타입이 명시되어 있기 때문에 형변환 안해도 가능
        String str4 = list2.get(0);
        String str5 = list2.get(1);
        String str6 = list2.get(2);

        Collection<String> coll = null; // 컬렉션이 구현하고 있는 객체는 무엇이든 올 수 있음.
        coll.add("abc");
        coll.add("def");
        coll.add("eez");

        Iterator<String> iter = list2.iterator();
        while (iter.hasNext()){
            String str = iter.next();

            System.out.println(str);
        }
    }
}
