package java_09m.abstracttest.test;

/**
 * 상속에 관한 내용을 파악하고 있나?
 * - 자식클래스는 부모 클래스를 상속받아 부모클래스의 정보를 사용한다.
 * - 자식클래스는 부모 클래스의 형태로 캐스팅될 수 있다. (다형성)
 * - 단, 자식클래스의 형태로 부모클래스가 캐스팅될 순 없다.
 */
public class Test {
    public static void main(String[] args) {
        OptimizedDiskCache op = new OptimizedDiskCache();
        Cache cache = op;

        MemoryCache mc = new MemoryCache();
        Cache cache2 = mc;

//        DiskCache dc = new DiskCache();
//        OptimizedDiskCache op2 = (OptimizedDiskCache) dc;

        OptimizedDiskCache op3 = new OptimizedDiskCache();
        DiskCache dc = op3;

//        Cache cache3 = new Cache();
//        MemoryCache mc2 = (MemoryCache) cache3;

        OptimizedDiskCache op4 = new OptimizedDiskCache();
        Cache cache4 = op4;
        DiskCache dc2 = (DiskCache) cache4;
    }
}

class Cache { }

class DiskCache extends Cache{ }

class MemoryCache extends Cache{ }

class OptimizedDiskCache extends DiskCache{ }

