package testinfo0821;

import java.util.Arrays;

/**
 * 1. java Util Arrays
 *
 * 2. 얕은복사 & 깊은복사
 * - 얕은복사 : 원본값과 복사된 값이 같은 참조 (메모리주소)를 가리킴
 * 얕은 복사 후 해당 변수를 재사용하여 수정한다면 원본 값이 동시에 변하므로 주의
 *
 * - 깊은복사 : 복사된 객체가 다른주소를 참조하여 내부의 값만 복사된다.
 *
 * @author cslim
 */
public class Array04 {
    public static void main(String[] args) {
        int[] copy = {1,2,3};
        int[] copyTo = Arrays.copyOf(copy, copy.length);
        int[] copyTo2 = copy;

        for (int c : copyTo) {
            System.out.println(c);
        }

        for (int a : copyTo2) {
            System.out.println(a);
        }

        if (copy == copyTo) {
            System.out.println("same");
        }
        else {
            System.out.println("different");
        }

        if (copy == copyTo2) {
            System.out.println("same");
        }
        else {
            System.out.println("different");
        }

        int[] copy2 = Arrays.copyOfRange(copy, 0,1);

        for (int b : copy2) {
            System.out.println(b);
        }

        if (copy == copy2) {
            System.out.println("same");
        } else {
            System.out.println("different");
        }
    }
}
