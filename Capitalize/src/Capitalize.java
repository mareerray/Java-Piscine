import java.io.*;

public class Capitalize {
    public static void capitalize(String[] args) throws IOException {
        if (args.length < 2) {
            return;
        }
        FileReader fr = new FileReader(args[0]);
        FileWriter fw = new FileWriter(args[1]);
        BufferedReader reader = new BufferedReader(fr);
        BufferedWriter writer = new BufferedWriter(fw);

        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(" ");
            for (int i = 0; i < parts.length; i++) {
                String word = parts[i];
                if (!word.isEmpty()) {
                    String firstChar = word.substring(0,1).toUpperCase();
                    String restChar = word.length() > 1
                        ? word.substring(1).toLowerCase()
                        : "";
                    parts[i] = firstChar + restChar;
                }
            }
            writer.write(String.join(" ", parts));
            writer.newLine();
        }
        reader.close();
        writer.close();
    }
}

// input file → reader → split → capitalize → join → writer → output file