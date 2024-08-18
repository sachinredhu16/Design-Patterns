package src.SyanSoftInterview;

import java.util.List;

public class TestImpl {
    public static void main(String[] args) {
        Test1 obj = new Test1();
        List<String> list = List.of("A","B","C","D"); // C B A D
        List<Integer> list1 = List.of(1,2,3,4); // 1 3 2 4

        obj.print(list);
        System.out.println();
        obj.print(list1);
    }
}
