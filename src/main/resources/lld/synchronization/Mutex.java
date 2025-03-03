package synchronization;

import java.util.concurrent.locks.Lock;

public class Mutex {
    Lock lock;
    private boolean isLocked = false;

    public synchronized void lock() throws InterruptedException {
        while (isLocked) {
            wait();
        }
        isLocked = true;
    }

    public synchronized void unlock() {
        isLocked = false;
        notify();
    }
    public synchronized boolean isLocked() {
        return isLocked;
    }
}
