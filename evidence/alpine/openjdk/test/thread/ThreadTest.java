public class ThreadTest {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Test start...");
        var thread = new Thread(() -> {
                System.out.println("Thread run...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread end.");
            });
        thread.start();
        Thread.sleep(500);
        System.out.println("Hello!!!");
        thread.join();
        System.out.println("Test end.");
    }
}
