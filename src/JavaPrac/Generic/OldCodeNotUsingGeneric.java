package JavaPrac.Generic;

import JavaPrac.Generic.classes.Apple;
import JavaPrac.Generic.classes.Box;
import JavaPrac.Generic.classes.Orange;

public class OldCodeNotUsingGeneric {
    public static void main(String[] args) {
        Box aBox  = new Box();
        Box bBox  = new Box();

        aBox.set(new Apple());
        bBox.set(new Orange());

        // 어쩔 수 없이 형변환 과정이 필요하다.
        Apple ap = (Apple)aBox.get();
        Orange or = (Orange)bBox.get();

        // 컴파일 단계에서 오류를 찾아낼 수 없다.
        System.out.println(ap);
        System.out.println(or);
    }
}
