package importantTask;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
/**
 * https://www.baeldung.com/java-images
 * https://www.dyclassroom.com/image-processing-project/how-to-create-a-mirror-image-in-java
 */
public class ReversingImage {
    public static void main(String[] args) {
        //BufferedImage for source image
        BufferedImage sourceImg = null;
        //File object
        File f = null;
        //read source image file
        try{
            f = new File("selfie.jpg");
            sourceImg = ImageIO.read(f);
        }catch(IOException e){
            System.out.println("Error: " + e);
        }
        int width = sourceImg.getWidth();
        int height = sourceImg.getHeight();
        BufferedImage reversedImage = new BufferedImage(width, height,  BufferedImage.TYPE_INT_ARGB);
        for(int y = 0; y < height; y++)
        {
            for(int x = 0; x < width / 2; x ++){
                int temp = sourceImg.getRGB(x, y);
                reversedImage.setRGB(x, y , sourceImg.getRGB(width - 1 - x, y));
                reversedImage.setRGB(width - 1 - x, y, sourceImg.getRGB(x, y));
            }
        }
        try{
            f = new File("reversed.png");
            ImageIO.write(reversedImage, "png", f);
        }catch(IOException e){
            System.out.println("Error: " + e);
        }
        displayImage(reversedImage);
        displayImage(sourceImg);
    }
    public static void displayImage(BufferedImage image){
        JLabel picLabel = new JLabel(new ImageIcon(image));
        JPanel jPanel = new JPanel();
        jPanel.add(picLabel);
        JFrame frame = new JFrame();
        frame.setSize(new Dimension(image.getWidth(), image.getHeight()));
        frame.add(jPanel);
        frame.setVisible(true);
    }
}