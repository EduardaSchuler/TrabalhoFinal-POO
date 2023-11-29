import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReproducaoPanel extends JPanel {
    private Aplicacao app;
    private MultiplosPaineis multiplosPaineis;

    public ReproducaoPanel(Aplicacao app, MultiplosPaineis multiplosPaineis) {
        this.app = app;
        this.multiplosPaineis = multiplosPaineis;
        setLayout(new BorderLayout());
        setBackground(Color.BLACK);

        JPanel botoesPanel = createBotoesPanel();

        add(botoesPanel, BorderLayout.NORTH);
    }

    private JPanel createBotoesPanel() {
        JPanel botoesPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton playButton = createButton("Play");
        JButton pauseButton = createButton("Pause");
        JButton searchButton = createButton("Pesquisar");
        JButton exitButton = createButton("Sair");

        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Audio musicaAleatoria = app.getPlaylist().getMusicaAleatoria();
                if (musicaAleatoria != null) {
                    JOptionPane.showMessageDialog(null, "Reproduzindo a música: " + musicaAleatoria.getTitulo());
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhuma música encontrada na playlist.");
                }
            }
        });

        pauseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Música pausada");
            }
        });
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Até logo :)");
                // Fechar o programa
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(ReproducaoPanel.this);
                frame.dispose(); // Fecha a janela do programa
            }
        });

        botoesPanel.add(playButton);
        botoesPanel.add(pauseButton);
        botoesPanel.add(searchButton);
        botoesPanel.add(exitButton);
        return botoesPanel;
    }

    private JButton createButton(String label) {
        JButton button = new JButton(label);
        return button;
    }
}
