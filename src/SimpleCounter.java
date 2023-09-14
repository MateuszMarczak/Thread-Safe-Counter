/**
 * SimpleCounter implements the Counter interface and provides a simple
 * implementation of the increment method.
 * It is not thread-safe.
 */
class SimpleCounter implements Counter {

    private int value = 0;

    @Override
    public void increment() {
        value++;
    }

    @Override
    public int getValue() {
        return value;
    }
}
