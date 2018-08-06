package log4j;

import org.testng.annotations.Test;

public class testLog4j {
    final static logControler log = logControler.getLogg(testLog4j.class);

    @Test
    public void testCase(){
        log.info("这是info");
        log.debug("这是debug");
        log.warn("这是warn");
        log.error("这是error");

    }
}
