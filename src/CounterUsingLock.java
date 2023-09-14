import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * CounterUsingLock implements Counter using a Lock.
 * It is a thread-safe counter.
 */
class CounterUsingLock implements Counter {

    private final Lock lock = new ReentrantLock();
    private int value = 0;

    @Override
    public void increment() {
        lock.lock();
        try {
            value++;
        } finally {
            lock.unlock();
        }
    }

    @Override
    public int getValue() {
        lock.lock();
        try {
            return value;
        } finally {
            lock.unlock();
        }
    }
}
