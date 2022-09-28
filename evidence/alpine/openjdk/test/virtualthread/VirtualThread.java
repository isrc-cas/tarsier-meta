import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class VirtualThread {
    public static void main(String[] args) {
        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            IntStream.range(0, 100000).forEach(i -> {
                executor.submit(() -> {
                    Thread.sleep(500);
                    return i;
                });
            });
        }
    }
}
