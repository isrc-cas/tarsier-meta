public class JITTest {
    public static int test(int n) {
        return (n * 2 + 3) / 6;
    }

    public static void main(String[] args) {
        int size = 0;
        for (int i = 0; i < 50000; i++)
            size += test(i);
        System.out.println(size);
    }
}
