import javax.swing.*;

public class Fenetre extends JFrame{
    private Panneau pan;
    private MyArray myArray;


    public Fenetre(){
        this.setTitle("Animation");
        this.setSize(1000, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        myArray = new MyArray();
        pan = new Panneau(myArray);
        this.setContentPane(pan);
        this.setVisible(true);

        go();
    }

    private void go(){
        for(;;){

            myArray.next();
            pan.repaint();

            try {
                Thread.sleep(25);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}