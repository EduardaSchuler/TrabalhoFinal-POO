import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPanel extends JPanel {
    private Aplicacao app;
    private MultiplosPaineis multiplosPaineis;

    public MenuPanel(Aplicacao app, MultiplosPaineis multiplosPaineis) {
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
        JButton searchButton = createButton("Pesquisar Audio");
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
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(MenuPanel.this);
                frame.dispose(); // Fecha a janela do programa
            }
        });

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userInput = JOptionPane.showInputDialog(null, "Digite o título do áudio:");
                if (userInput != null && !userInput.isEmpty()) {
                    JOptionPane.showMessageDialog(null, app.getTodasMusicasDeTodosAlbuns().stream().filter(audio -> userInput.equals(audio.getTitulo())).toList());
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhum titulo inserido ou encontrado");
                }
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
