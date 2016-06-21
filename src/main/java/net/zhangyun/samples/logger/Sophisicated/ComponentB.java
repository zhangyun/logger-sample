package net.zhangyun.samples.logger.Sophisicated;

/**
 * Created by zhangyun on 6/21/16.
 */
public class ComponentB extends LoggerBase {
    public void doStuffForB() {
        trace("Begin Do Stuff For B");

        int start = 0;
        int end = 1000;
        debug("Begin with range: " + start + ":" + end);

        int sum = 0;
        for (int i=0; i<end; ++i) {
            try {

                if (i%10 == 0) {
                    throw new ExceptionWarn();
                } else if (i == 66) {
                    throw new ExceptionFatal();
                } else {
                    sum += i;
                }

            } catch (ExceptionWarn e) {
                warn("Something's wrong");
            } catch (ExceptionFatal e) {
                error("Something's seriously wrong");

                break;
            }
        }
        info("Sum is " + sum);

        trace("End Do Stuff For B");
    }
}
