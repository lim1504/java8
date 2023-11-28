package java_11m.java1128;

import java.util.Arrays;
import java.util.List;

public class Point {
    double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // 두점사이 계산
    public double distanceTo(Point other) {
        double deltaX = this.x - other.x;
        double deltaY = this.y - other.y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
}

// 포인트정보 LIST로 표시
class PointCollection {
    List<Point> points;


    public PointCollection(List<Point> points) {
        this.points = points;
    }

    // 모든점 사이 계산
    public double totalDistance() {
        double total = 0.0;
        for (int i = 0; i < points.size() - 1; i++) {
            total += points.get(i).distanceTo(points.get(i + 1));
        }
        return total;
    }
}

//test main
class ObjectOrientedExample {
    public static void main(String[] args) {
        List<Point> points = Arrays.asList(
                new Point(0, 0),
                new Point(1, 1),
                new Point(2, 2)
        );

        PointCollection pointCollection = new PointCollection(points);
        double distance = pointCollection.totalDistance();
        System.out.println("Total distance: " + distance);
    }
}

/**
 * 객체지향 코드와 다른점은 배열을 통해 오버헤드의 가능성을 최소한으로 줄이고, 직접적인 표현을 사용하였다.
 *
 *
 */
class PointCollectionTwo {
    double[] xCoordinates;
    double[] yCoordinates;

    public PointCollectionTwo(double[] xCoordinates, double[] yCoordinates) {
        this.xCoordinates = xCoordinates;
        this.yCoordinates = yCoordinates;
    }

    public double totalDistance() {
        double total = 0.0;
        for (int i = 0; i < xCoordinates.length - 1; i++) {
            double deltaX = xCoordinates[i] - xCoordinates[i + 1];
            double deltaY = yCoordinates[i] - yCoordinates[i + 1];
            total += Math.sqrt(deltaX * deltaX + deltaY * deltaY);
        }
        return total;
    }
}

//test main
class DataOrientedComparison {
    public static void main(String[] args) {
        double[] xCoordinates = {0, 1, 2};
        double[] yCoordinates = {0, 1, 2};

        PointCollectionTwo pointCollection = new PointCollectionTwo(xCoordinates, yCoordinates);
        double distance = pointCollection.totalDistance();
        System.out.println("Data-Oriented Total distance: " + distance);
    }
}

