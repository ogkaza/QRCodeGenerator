import com.google.zxing.*;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

import javax.swing.*;
import java.awt.image.BufferedImage;

public class CreatorQRC {
    public static void generateQR(String d) throws WriterException{
        QRCodeWriter qrCodeWriter = new QRCodeWriter();
        BitMatrix bitMatrix = qrCodeWriter.encode(d, BarcodeFormat.QR_CODE, 500, 500);
        BufferedImage qrImage = MatrixToImageWriter.toBufferedImage(bitMatrix);
        createWindow(qrImage);
    }

    public static void createWindow(BufferedImage imgQR){
        JFrame frame = new JFrame();
        frame.setSize(700, 700);

        ImageIcon img = new ImageIcon(imgQR);
        JLabel labelQR = new JLabel(img);
        frame.getContentPane().add(labelQR);
        frame.setVisible(true);
    }
}
