import java.util.*;
import java.text.*;

public class DateTest {
   public static void main(String[] args) {
       TimeZone.setDefault(TimeZone.getTimeZone("Etc/GMT-8"));
       var dNow = new Date();
       var ft = new SimpleDateFormat ("yyyy-MM-dd hh:mm:ss");
       System.out.println("当前时间为: " + ft.format(dNow));
   }
}
