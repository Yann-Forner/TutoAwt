import javax.swing.*;
import java.awt.*;

public class Panneau extends JPanel {
    private int posX = -10;
    private int posY = -10;

    public void paintComponent(Graphics g){
        g.setColor(Color.red);
        g.fillRect(posX, posY, 50, 50);
        g.setColor(Color.blue);
        g.fillOval(100,100,50,50);
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }
}