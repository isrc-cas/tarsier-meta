import java.io.*;

public class SerializableTest {
    public static class Employee implements Serializable {
        public String name;
        public String address;
        public transient int SSN;
        public int number;
        public void mailCheck() {
            System.out.println("Mailing a check to " + name + " " + address);
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        var e = new Employee();
        e.name = "Reyan Ali";
        e.address = "Phokka Kuan, Ambehta Peer";
        e.SSN = 11122333;
        e.number = 101;
        var fileOut = new FileOutputStream("./employee.ser");
        var out = new ObjectOutputStream(fileOut);
        out.writeObject(e);
        out.close();
        fileOut.close();
        System.out.printf("Serialized data is saved in ./employee.ser");
        var fileIn = new FileInputStream("./employee.ser");
        var in = new ObjectInputStream(fileIn);
        var e2 = (Employee) in.readObject();
        in.close();
        fileIn.close();
        System.out.println("Deserialized Employee...");
        System.out.println("Name: " + e2.name);
        System.out.println("Address: " + e2.address);
        System.out.println("SSN: " + e2.SSN);
        System.out.println("Number: " + e.number);
        e2.mailCheck();
    }
}

