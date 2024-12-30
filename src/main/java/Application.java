import com.google.zxing.WriterException;

import java.io.FileNotFoundException;

public class Application {
    public static void main(String[] args) throws WriterException, FileNotFoundException {
        if(args.length == 0) return;
        String data = DataReader.readData(args[1]);
        CreatorQRC.generateQR(data);
    }
}
