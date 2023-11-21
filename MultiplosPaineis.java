import javax.swing.*;
import java.awt.*;
import javax.swing.border.EmptyBorder;

public class MultiplosPaineis extends JPanel { // Alteração: agora estende JPanel
    private JTabbedPane multiplosPaineis;

    public MultiplosPaineis() {
        setLayout(new BorderLayout());
        multiplosPaineis = new JTabbedPane();

        addPanel("Artistas", "Explore seus artistas favoritos");
        addPanel("Álbuns", "Navegue pelos álbuns");
        addPanel("Playlists", "Acesse suas playlists");
        addPanel("Podcasts", "Descubra novos podcasts");

        add(multiplosPaineis, BorderLayout.CENTER); // Adicionando o JTabbedPane ao painel principal
    }

    public void addPanel(String panelName, String description) {
        JPanel panel = new JPanel(new BorderLayout());

        JLabel descriptionLabel = new JLabel(description, SwingConstants.CENTER);
        descriptionLabel.setFont(new Font("Calibri", Font.BOLD, 12));
        descriptionLabel.setBorder(new EmptyBorder(10, 0, 10, 0));
        panel.add(descriptionLabel, BorderLayout.NORTH);

        JPanel wrappedPanel = wrapWithReproducaoPanel(panel);
        multiplosPaineis.add(panelName, wrappedPanel);
    }

    public JPanel wrapWithReproducaoPanel(JPanel panelToWrap) {
        JPanel wrapperPanel = new JPanel(new BorderLayout());
        JPanel reproducaoPanel = new ReproducaoPanel();
        wrapperPanel.add(panelToWrap, BorderLayout.CENTER);
        wrapperPanel.add(reproducaoPanel, BorderLayout.SOUTH);
        return wrapperPanel;
    }

}
