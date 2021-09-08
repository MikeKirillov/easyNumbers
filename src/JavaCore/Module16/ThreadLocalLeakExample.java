package JavaCore.Module16;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadLocalLeakExample {
    static class Job implements Runnable {
        private static final ThreadLocal<List<Object>> LOCAL_DATA = ThreadLocal.withInitial(ArrayList::new);

        @Override
        public void run() {
            try {
                List<Object> objects = LOCAL_DATA.get();
                objects.add(new byte[1024 * 1024]);
            } finally {
                LOCAL_DATA.remove();
            }
        }
    }

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 100; i++) {
            service.execute(new Job());
        }
    }
}
