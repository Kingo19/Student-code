import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class FReader {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Student\\Desktop\\king.txt";
        FileReader reader = new FileReader(path);
        BufferedReader buffer = new BufferedReader(reader);
        String line;

        while ((line = buffer.readLine())!=null) {
            System.out.println(line);
        }
    }


}
