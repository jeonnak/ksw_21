package mission1;

import java.util.List;
import java.util.Arrays;

public class Shape {
    private String type, color;
    private Double area;


    // 모든 필드를 초기화 하는 생성자
    public Shape(String type, String color, Double area) {
        this.type = type;
        this.color = color;
        this.area = area;
    }

    // 모든 필드에 대한 게터 함수
    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return area;
    }
    public String toString() {
        return String.format("%s(%s, %1.f)", type, color, area);
    }

    //1-2
    static List<shape> shapes = Arrays.asList(new Shape("삼각형", "빨간색", 10.5)
            , new Shape("사각형", "파란색", 11.2), new Shape("원", "파란색", 16.5)
            , new Shape("원", "빨간색", 5.3), new Shape("원", "노란색", 8.1)
            , new Shape("사각형", "파란색", 20.7), new Shape("삼각형", "파란색", 3.4)
            , new Shape("사각형", "빨간색", 12.6)
    );

}

