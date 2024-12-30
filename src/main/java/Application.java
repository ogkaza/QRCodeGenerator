import com.google.zxing.WriterException;

public class Application {
    public static void main(String[] args) throws WriterException {
        String data = "https://github.com/ogkaza";

        CreatorQRC.generateQR(data);
    }
}
