import javax.swing.*;

public class simplegui {

    private JFrame f;

    public simplegui() {
        f = new JFrame("Hello World");
        f.setSize(400,300);
        f.setLayout(null);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        simplegui simple =  new simplegui();
    }
}
