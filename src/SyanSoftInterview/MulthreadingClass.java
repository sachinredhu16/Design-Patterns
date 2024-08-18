package src.SyanSoftInterview;

import java.time.LocalDateTime;

public class MulthreadingClass {
    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<1000;i++)
                    System.out.println(LocalDateTime.now()+ " "+i);
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1000;i<2000;i++)
                    System.out.println(LocalDateTime.now()+" "+i);
            }
        });

        t1.start();
        t2.start();
    }
}
