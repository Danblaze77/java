import java.io.*;

public class BinaryFileDemo {

    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("data.bin");
             DataOutputStream dos = new DataOutputStream(fos)) {
            dos.writeInt(100);
            dos.writeDouble(3.14);
            dos.writeBoolean(true);
            dos.writeUTF("Hello");
            System.out.println("Data written to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read the data from the file
        try (FileInputStream fis = new FileInputStream("data.bin");
             DataInputStream dis = new DataInputStream(fis)) {
            int i = dis.readInt();
            double d = dis.readDouble();
            boolean b = dis.readBoolean();
            String s = dis.readUTF();
            System.out.println("Data read from the file:");
            System.out.println("i = " + i);
            System.out.println("d = " + d);
            System.out.println("b = " + b);
            System.out.println("s = " + s);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
