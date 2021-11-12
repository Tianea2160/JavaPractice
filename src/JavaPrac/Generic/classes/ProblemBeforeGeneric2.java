package JavaPrac.Generic.classes;

public class ProblemBeforeGeneric2 {
    public static void main(String[] args) {
        Box aBox = new Box();
        Box oBox = new Box();

        aBox.set("Apple");
        oBox.set("Orange");

        // 프로그래머의 실수가 실행과정에서 조차 발견 되지 않을 수 있다.
        System.out.println(aBox.get());
        System.out.println(oBox.get());

    }
}
