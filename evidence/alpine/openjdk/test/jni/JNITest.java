public class JNITest {
    public native void testHello();

    public static void main(String[] args) {
        System.load("/root/test/openjdk/jni/TestJNI.so");
        new JNITest().testHello();
    }
}
