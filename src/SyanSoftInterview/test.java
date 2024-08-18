package src.SyanSoftInterview;

public class test {
    public static void main(String[] args) {
        System.out.println(recursion(-5));
    }
    public static int recursion(int x){
        if(x==1 || x==-1)
            return x;
        if(x>0)
            return x*recursion(x-1);
        return x*recursion(x+1);
    }
//    -5 * -4 * -3 *-2 * -1;

}
