package threelettersequences;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileService {

    public static String readFile(Path filePath) throws IOException {
        byte[] fileByteArray = new byte[0];
        fileByteArray = Files.readAllBytes(filePath);
        String str = new String(fileByteArray);
        return str;
    }

}
