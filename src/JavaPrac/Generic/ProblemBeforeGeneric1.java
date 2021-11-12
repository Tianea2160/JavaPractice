package JavaPrac.Generic;

import JavaPrac.Generic.classes.Apple;
import JavaPrac.Generic.classes.Box;
import JavaPrac.Generic.classes.Orange;

public class ProblemBeforeGeneric1 {
    public static void main(String[] args) {
        Box aBox = new Box();
        Box oBox = new Box();

        aBox.set("Apple");
        oBox.set("Orange");

        // 컴파일 단계에서는 어느 부분이 오류가 생기는 지 알 수가 없다.
        // 아래 코드는 class Apple, Orange가 담기지 않았는데도 a, o를 꺼내려고 한다.
        Apple a = (Apple) aBox.get();
        Orange o = (Orange) oBox.get();

        System.out.println(a);
        System.out.println(o);
    }

}
