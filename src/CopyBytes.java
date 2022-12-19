import java.io.*;

public class CopyBytes {
    public static void main(String[] args) throws IOException {
        FileInputStream input = null;
        FileOutputStream out = null;

        try {
            input = new FileInputStream("adele.txt");
            out = new FileOutputStream("out.txt");
            int c;
            while ((c = input.read()) != -1) {
                out.write(c);
            }

        } finally {
            if (input != null) {
                input.close();
            }
            if (out != null) {
                out.close();
            }
        }

    }
}
