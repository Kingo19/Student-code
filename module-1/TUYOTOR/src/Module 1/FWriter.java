import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class FWriter {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Student\\Desktop\\king.txt";
        FileWriter writer = new FileWriter(path);
        BufferedWriter buffer = new BufferedWriter(writer);

        buffer.write("Abebe beso bela, Chala chube chebete");
        buffer.newLine();
        buffer.close();
    }




}
