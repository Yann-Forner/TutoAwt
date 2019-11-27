import javax.swing.*;

public class Fenetre extends JFrame{
    private Panneau pan = new Panneau();

    public Fenetre(){
        this.setTitle("Animation");
        this.setSize(600, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setContentPane(pan);
        this.setVisible(true);
        go();
    }

    private void go(){
        int vitesseX = 1;
        int vitesseY=1;
        for(;;){

            if(pan.getPosX()>this.getWidth()-50 || pan.getPosX() < 0)vitesseX=vitesseX*-1;
            if(pan.getPosY()>this.getHeight()-70 || pan.getPosY() < 0)vitesseY=vitesseY*-1;
            pan.setPosX(pan.getPosX() + vitesseX);
            pan.setPosY(pan.getPosY() + vitesseY);
            pan.repaint();

            try {
                Thread.sleep(25);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}