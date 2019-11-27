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
        for(int i = -50; i < pan.getWidth(); i++){

            pan.setPosX(pan.getPosX() + 1);
            pan.repaint();

            try {
                Thread.sleep(25);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}