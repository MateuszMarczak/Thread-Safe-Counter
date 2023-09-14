import java.util.concurrent.atomic.AtomicInteger;

import static java.lang.Thread.sleep;


/**
 * AtomicCounter implements Counter using an AtomicInteger.
 * It is a thread-safe counter.
 */
class AtomicCounter implements Counter {

    private AtomicInteger value = new AtomicInteger(0);

    @Override
    public void increment() {
        value.incrementAndGet();

    }

    @Override
    public int getValue() {
        return value.get();
    }
}
