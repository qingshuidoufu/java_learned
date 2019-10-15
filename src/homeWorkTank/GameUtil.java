package homeWorkTank;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class GameUtil {
    //工具类最好将构造器私有化
    private GameUtil(){

    }
    public static Image getImage(File f) throws IOException {
        Image readImage=ImageIO.read(f);
        return readImage;
    }
}
