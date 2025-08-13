import java.io.*;

public class CatInFile {
    public static void cat(String[] args) throws IOException {
        // check if an argument is given
        if (args.length == 0) {
            return;
        }
        // Open the output file for writing
        OutputStream output = new FileOutputStream(args[0]);

        // Buffer for reading and writing small chunks
        byte[] buffer = new byte[1024];

        // Read and write each chunk in a loop
        int length;
        while ((length = System.in.read(buffer)) != -1) {
            output.write(buffer, 0, length);
        }
        output.close();
    }
}