import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        // cria uma instancia de JFrame que vai ser usada tanto em MultiplosPaineis
        JFrame frame = new JFrame("Spotify");
        MultiplosPaineis multiplosPaineis = new MultiplosPaineis();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(multiplosPaineis);
        frame.setSize(600, 400);
        frame.setVisible(true);
    }
}
