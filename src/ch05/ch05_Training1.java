package ch05;

/*
문제) 가로, 세로, 깊이 => 부피, 겉넓이

1) 절차 지향

2) 객체 지향
    1. 객체 추상화: 박스
        - 상태: 가로, 세로, 깊이
        - 동작: 부피, 겉넓이

    2. UML
        Box
        ----------
        +w: int
        +h: int
        +d: int
        ----------
        +volume(): int
        +area(): int


 */

public class ch05_Training1 {
    public static void main(String[] args) {
        int w = 10, h = 20, d = 30;

//        System.out.println("부피: " + volume(w,h,d));
//        System.out.println("겉넓이: " + area(w,h,d));
// 절차 지향식

        Box b = new Box();
        b.w = 10; b.h = 20; b.d= 30;
        System.out.println("부피: " + b.volume());
        System.out.println("겉넓이: " + b.area());
    }

    static int volume(int w, int h, int d) {
        return w*h*d;       // 부피 반환
    }

    static int area(int w, int h, int d) {
        return (w * h + h * d + d * w) * 2;     // 겉넓이 반환
    }

    // 절차 지향식
}

class Box {     // 객체 지향식
    int w, h, d;        // 필드

    int volume() {
        return w * h * d;
    }

    int area() {
        return (w * h + h * d + d * w) * 2;     // 겉넓이 반환
    }
}