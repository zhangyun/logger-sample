package net.zhangyun.samples.logger.Sophisicated;

/**
 * Created by zhangyun on 6/21/16.
 */
public class ComponentA extends LoggerBase {

    public void doStuffForA() {
        trace("Begin Do Stuff For A");

        Thread t = new Thread(new Runnable() {
            public void run() {
                trace("Thread Start");

                int start = 0;
                int end = 100;
                debug("Begin with range: " + start + ":" + end);

                int sum = 0;
                for (int i=start; i<end; ++i) {
                    sum += i;
                }

                info("Sum is " + sum);

                trace("Thread End");
            }
        });

        t.start();
        trace("End Do Stuff For A");
    }
}
