import com.google.zxing.*;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;

public class CreatorQRC {
    static final int WIDTH = 500;
    static final int HEIGHT = 500;

    public static void generateQR(String d) throws WriterException{
        QRCodeWriter qrCodeWriter = new QRCodeWriter();
        BitMatrix bitMatrix = qrCodeWriter.encode(d, BarcodeFormat.QR_CODE, WIDTH, HEIGHT);
        BufferedImage qrImage = MatrixToImageWriter.toBufferedImage(bitMatrix);
        createWindow(qrImage);
    }

    public static void createWindow(BufferedImage imgQR){
        JFrame frame = new JFrame("QR Code");
        frame.setSize(WIDTH, HEIGHT);

        ImageIcon img = new ImageIcon(imgQR);
        JLabel labelQR = new JLabel(img);
        frame.getContentPane().add(labelQR);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
