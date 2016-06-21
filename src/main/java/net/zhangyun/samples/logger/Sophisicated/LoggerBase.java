package net.zhangyun.samples.logger.Sophisicated;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by zhangyun on 6/21/16.
 */
public abstract class LoggerBase {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public void trace(String msg) {
        logger.trace(msg);
    }

    public void debug(String msg) {
        logger.debug(msg);
    }

    public void info(String msg) {
        logger.info(msg);
    }

    public void warn(String msg) {
        logger.warn(msg);
    }

    public void error(String msg) {
        logger.error(msg);
    }

}
