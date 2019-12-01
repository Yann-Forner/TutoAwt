import javax.swing.*;
import java.awt.*;

public class Panneau extends JPanel {
    private MyArray myArray;

    public Panneau(MyArray myArray) {
        this.myArray = myArray;
    }

    public void paintComponent(Graphics g){
        g.setColor(Color.WHITE);
        g.fillRect(-10,-10,this.getWidth()+10,this.getHeight()+10);


        for (int i = 0; i<this.getWidth();i+=5){
            if(i/5 == myArray.getPosition()) {
                g.setColor(Color.GREEN);
                g.fillRect(i,this.getHeight()-myArray.get(i/5),5,1000);
            }else{
                g.setColor(Color.BLACK);
                g.drawRect(i,this.getHeight()-myArray.get(i/5),5,1000);
            }
        }
    }

}