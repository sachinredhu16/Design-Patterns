package src.SyanSoftInterview;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class jfs {
    static Function<Integer,Integer> map = x->x;
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5);

        list.stream().map(map);

//        Optional<Integer> reduce = list.stream().filter(x -> x % 2 == 0).reduce((x, y) -> x + y);
//        list.stream().filter(x -> x % 2 == 0).mapToInt(Integer::intValue).sum();
//
//        System.out.println(reduce.get());
    }
}

class A {
    public static void  print(){
        System.out.println("Hi Sachin");
    }
}
