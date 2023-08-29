package testinfo0821;

/**
 * 가변배열
 * @author cslim
 */
public class Array03 {
    public static void main(String[] args) {
        int[][] array = new int[3][]; // 아직 2번째 배열의 정보가 정해지지 않은 상태
        array[0] = new int[1]; // 정해지지않은 배열정보 지정
        array[1] = new int[15];
        // 0 0
        // 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0

    }
}
