import java.util.ArrayList;

public class ListTest {
    public static void main(String[] args) {
        ArrayList<String> sites = new ArrayList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        sites.set(2, "Wiki");
        System.out.println(sites);
        System.out.println(sites.get(1));
    }
}
