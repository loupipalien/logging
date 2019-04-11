package com.ltchen.logging.slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author : ltchen
 */
public class Wombat {

    private static  final Logger logger = LoggerFactory.getLogger(Wombat.class);
    private Integer t;
    private Integer oldT;

    public void setTemperature(Integer temperature) {

        oldT = t;
        t = temperature;

        logger.debug("Temperature set to {}. Old temperature was {}.", t, oldT);

        if(temperature.intValue() > 50) {
            logger.info("Temperature has risen above 50 degrees.");
        }
    }

    public static void main(String[] args) {
        new Wombat().setTemperature(100);
    }
}
