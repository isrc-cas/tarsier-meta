import java.util.HashMap;

public class MapTest {
    public static void main(String[] args) {
        var sites = new HashMap<String, String>();
        sites.put("one", "Google");
        sites.put("two", "Runoob");
        sites.put("three", "Taobao");
        sites.put("four", "Zhihu");
        System.out.println(sites);
        System.out.println(sites.get("one"));
    }
}

