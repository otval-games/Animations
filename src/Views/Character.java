package Views;

import Modules.Anims.AnimFire;
import Modules.Anims.Animation;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Character extends JPanel {
    private BufferedImage img;
    private int x = 10;
    private int y = 0;

    public Character() {
        try {
            img = ImageIO.read(new File("src/Refs/Sprite.jpg"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void nextFrame() {
        x -= 100;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.drawImage(img, x, y, null);
    }

    public void anim(Animation anim) {
        anim.setCharacter(this);
        anim.start();
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}