import java.util.concurrent.atomic.LongAdder;

/**
 * LongAdderCounter implements Counter using a LongAdder.
 * It is a thread-safe counter.
 */
class LongAdderCounter implements Counter {

    private final LongAdder value = new LongAdder();

    @Override
    public void increment() {
        value.increment();
    }

    @Override
    public int getValue() {
        return value.intValue();
    }
}
