
/**
 * SynchronizedCounter implements Counter interface.
 * It is a thread-safe counter.
 * It uses synchronized keyword to make sure that only one thread can access the counter at a time.
 */
class SynchronizedCounter implements Counter {

    private int value = 0;

    @Override
    public synchronized void increment() {
        value++;
    }

    @Override
    public synchronized int getValue() {
        return value;
    }
}
