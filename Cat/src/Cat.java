import java.io.*;

public class Cat {
    public static void cat(String[] args) throws IOException {
        // Check if there’s no filename, exit the function.
        if (args.length == 0) {
            return;
        }
        // Opens the file whose name is in args for reading.
        InputStream input = new FileInputStream(args[0]);

        // Make a buffer (array of bytes) to read a chunk at a time.
        byte[] buffer = new byte[1024];

        // Use a loop to read and print until the file ends.
        int length;
        while ((length = input.read(buffer)) != -1) {
            System.out.write(buffer, 0, length);
        }
        // Close the input stream
        input.close();
    }
}

// "Get filename → open input → read chunks → print → close"