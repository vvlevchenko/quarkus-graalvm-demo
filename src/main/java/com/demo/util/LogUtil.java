package com.demo.util;


import java.util.logging.Level;
import java.util.logging.Logger;

import static java.util.logging.Level.FINE;


public class LogUtil {
    static Logger logger = Logger.getLogger(LogUtil.class.getName());
    
    public static void log(Level level, String message) {
        logger.log(level, message);
    }

    public static void log(Level level, String message, Throwable t) {
        if (t != null) {
            message += "\n" + t.getMessage();
        }
        logger.log(level, message, t);
    }

    public static void init() {
        logger.setLevel(FINE);
    }


}
