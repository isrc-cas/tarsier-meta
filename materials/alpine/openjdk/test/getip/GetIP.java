import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetIP {
    public static void main(String[] args) throws UnknownHostException {
        var address = InetAddress.getByName("www.google.com");
        System.out.println(address.getHostName() + " = " + address.getHostAddress());
    }
}
