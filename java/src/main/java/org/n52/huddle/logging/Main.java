package org.n52.huddle.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

import java.time.OffsetDateTime;

public class Main {
    private static final Logger LOG = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) throws Exception {
        try (MDC.MDCCloseable mdc = MDC.putCloseable("requestId", "req1")) {
            while (true) {
                LOG.info("Die Uhrzeit ist {}", OffsetDateTime.now());
                Thread.sleep(1000);
            }
        }

    }
}