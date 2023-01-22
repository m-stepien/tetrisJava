package component;

import java.util.concurrent.TimeUnit;

public class Clock {
    public void pause() throws InterruptedException {
        Thread.sleep(5000);
    }
}
