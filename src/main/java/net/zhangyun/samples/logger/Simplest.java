package net.zhangyun.samples.logger;

import org.slf4j.*;

/**
 * Simplest sample to demonstrate how logger works
 */
public class Simplest {

    /**
     * the logger object
     */
    public static Logger logger = LoggerFactory.getLogger(Simplest.class);

    /**
     * main entry to demonstrate how logger works
     * @param args
     */
    public static void main(String[] args) {

        logger.info("Hello Info");
        logger.debug("Hello Debug");
    }
}
