package src.SyanSoftInterview;


import java.util.List;

public class Test1<T> {

    public void print(List<T> obj) {
        if (obj.size() == 0)
            return;
        String s1 = String.valueOf(obj.get(0));
        char s = s1.charAt(0);
        if ((s >= 65 && s <= 92) || (s >= 97 && s <= 122)) {
            for (int i = 2; i >= 0; i--)
                System.out.print(obj.get(i) + " ");
            System.out.print(obj.get(obj.size() - 1) + " ");
        } else {
            for (int i = 0; i < obj.size(); i += 2) {
                System.out.print(obj.get(i) + " ");
            }
            for (int i = 1; i < obj.size(); i += 2) {
                System.out.print(obj.get(i) + " ");
            }
        }


    }
}


