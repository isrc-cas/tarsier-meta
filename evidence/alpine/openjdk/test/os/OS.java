public class OS {
    public static void main(String[] args) {
        var props = System.getProperties();
        System.out.println("osName: " + props.getProperty("os.name"));
        System.out.println("osArch: " + props.getProperty("os.arch"));
    }
}
