package com.choong.log4j.test;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.net.SocketAppender;

public class Log4jSocketAppenderTest {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Log4jSocketAppenderTest.class);

        PatternLayout patternLayout = new PatternLayout("%t :: %d :: %m%n");

        ConsoleAppender consoleAppender = new ConsoleAppender(patternLayout);
        SocketAppender socketAppender = new SocketAppender("localhost", 9999);

        logger.addAppender(consoleAppender);
        logger.addAppender(socketAppender);

        logger.info("Hello, ChoongYul!");
    }
}
