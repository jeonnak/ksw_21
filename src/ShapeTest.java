package mission1;

import java.util.List;
import java.util.ArrayList;

public class ShapeTest {

    //특정 모형 찾는 메서드 구현

    // findShapesByType. 사각형만 출력해주기
    static List<shape> findShapesByType(List<Shape> shapes, String type){

        List<Shape> result = new ArrayList<>();
        for (Shape s : shapes) {
            if (s.getType().equals(type))
                result.add(s);
        }
        return result;
    }

    // findShapesByColorNArea. 빨갛고 12이하 도형
    static List<shape> findShapesByColorNArea(List<Shape> shapes, String type, String color, Double area);{

        List<Shape> result = new ArrayList<>();
        for (Shape s : shapes) {
            if (s.getColor().equals(color) && s.getArea() <= area)
                result.add(s);
        }
        return result;
    }

    public static void main(String[] args) {

        // 사각형 rect
        List<shape> rect = findShapesByType(Shape.shapes, "사각형");
        System.out.print("사각형 : ");
        System.out.println(rect);

        //빨간도형 찾기 red
        List<shape> red = findShapesByColorNArea(Shape.shapes, "빨간색", 12.0);
        System.out.print("빨간 도형(면적<=12.0) : ");
        System.out.println(red);

    }
}
