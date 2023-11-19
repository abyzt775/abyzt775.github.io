import javax.swing.*;

public class Ventana {
    
    // linea auto-ejecutable
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana en java usando JFrame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setSize(800, 600);
        frame.pack();
        frame.setVisible(true);
    }

}
