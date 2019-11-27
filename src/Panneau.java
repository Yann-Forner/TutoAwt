import javax.swing.*;
import java.awt.*;

public class Panneau extends JPanel {
    private int posX = 0;
    private int posY = 0;

    public void paintComponent(Graphics g){
        g.setColor(Color.white);
        g.fillRect(-10,-10,this.getWidth()+10,this.getHeight()+10);



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