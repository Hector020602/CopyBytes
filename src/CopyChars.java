import java.io.*;

public class CopyChars {
    public static void main(String[] args) throws IOException {
        FileReader input = null;
        FileWriter out = null;

        try {
            input = new FileReader("adele.txt");
            out = new FileWriter("out.txt");
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
