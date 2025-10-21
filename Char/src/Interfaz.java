import javax.swing.*;

public class Interfaz {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Bienvenido");
        ventana.setSize(400, 500);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JLabel h = new JLabel();
        h.setBounds(200, 250, 100, 100);
        h.setText("No se suben gordas");
        ventana.add(h);
    }
}
