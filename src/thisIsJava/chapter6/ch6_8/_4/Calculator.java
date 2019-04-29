package thisIsJava.chapter6.ch6_8._4;

public class Calculator {
    //메소드 오버로딩

    //정사각형의 넓이
    double areaRectangle(double width) {
        return width * width;
    }
    //직사각형의 넓이
    double areaRectangle(double width, double height) {
        return width * height;
    }
}
