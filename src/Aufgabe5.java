import java.io.*;

public class Aufgabe5 {


    public static void main(String[] args) throws IOException {

        try (BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null){
                if (!Character.isWhitespace(line.charAt(0)) && !line.startsWith("#")){
                    sb.append(line);
                    sb.append(System.lineSeparator());
                }
                    line = br.readLine();
            }
            String everything = sb.toString();
            System.out.println(everything);
        }
    }
}
