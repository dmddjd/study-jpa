package jpa2;

public class ValueMain {
    public static void main(String[] args) {
        // 기본 값 타입
        int a1 = 10;
        int b1 = a1;
        a1 = 20;
        System.out.println("a1 : " + a1);
        System.out.println("b1 : " + b1);

        Integer a2 = 10;
        Integer b2 = a2;
        a2 = 20;

        System.out.println("a2 : " + a2);
        System.out.println("b2 : " + b2);

    }
}
