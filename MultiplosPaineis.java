import javax.swing.*;
import java.awt.*;
import java.util.List;
import javax.swing.border.EmptyBorder;

public class MultiplosPaineis extends JPanel { // Alteração: agora estende JPanel
    private JTabbedPane multiplosPaineis;
    private Aplicacao app;

    public MultiplosPaineis() {
        app = new Aplicacao();
        setLayout(new BorderLayout());
        multiplosPaineis = new JTabbedPane();

        addPanel("Artistas", "Explore seus artistas favoritos", app.getListaArtistas());
        addPanel("Álbuns", "Navegue pelos álbuns", app.getListaAlbuns());
        addPanel("Playlists", "Acesse suas playlists", app.getPlaylist().getFilaDeReproducao().stream().toList());
        addPanel("Podcasts", "Descubra novos podcasts", app.getListaPodcasts());

        add(multiplosPaineis, BorderLayout.CENTER); // Adicionando o JTabbedPane ao painel principal
    }

    public void addPanel(String panelName, String description, List list) {
        JPanel panel = new JPanel(new BorderLayout());

        JLabel descriptionLabel = new JLabel(description, SwingConstants.CENTER);
        descriptionLabel.setFont(new Font("Calibri", Font.BOLD, 12));
        descriptionLabel.setBorder(new EmptyBorder(10, 0, 10, 0));
        panel.add(descriptionLabel, BorderLayout.NORTH);

        StringBuilder labelText = new StringBuilder("<html>"); // Usando HTML para permitir várias linhas
        for (Object obj : list) {
            labelText.append(obj.toString()).append("<br>");
        }
        labelText.append("</html>");

        JLabel infoLabel = new JLabel(labelText.toString(), SwingConstants.CENTER);
        infoLabel.setFont(new Font("Calibri", Font.BOLD, 12));
        infoLabel.setBorder(new EmptyBorder(10, 0, 10, 0));
        panel.add(infoLabel, BorderLayout.SOUTH);

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
