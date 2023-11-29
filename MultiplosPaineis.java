import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.border.EmptyBorder;

public class MultiplosPaineis extends JPanel { // Alteração: agora estende JPanel
    private JTabbedPane multiplosPaineis;
    private Aplicacao app;

    public MultiplosPaineis() {
        app = new Aplicacao();
        setLayout(new BorderLayout());
        multiplosPaineis = new JTabbedPane();

        addPanel("Artistas", "Explore seus artistas favoritos", app.getListaArtistas(), app.getListaArtistas().stream().count());
        addPanel("Álbuns", "Navegue pelos álbuns", app.getListaAlbuns(), app.getListaAlbuns().stream().count());
        addPanel("Playlist", app.getPlaylist().toString(), app.getPlaylist().getFilaDeReproducao().stream().toList(), app.getPlaylist().getFilaDeReproducao().stream().count());
        addPanel("Podcasts", "Descubra novos podcasts", app.getListaPodcasts(), app.getListaPodcasts().stream().count());

        addPanelAddToPlaylist("Adicionar à playlist", app.getTodasMusicasDeTodosAlbuns());

        add(multiplosPaineis, BorderLayout.CENTER); // Adicionando o JTabbedPane ao painel principal
    }

    public void addPanel(String panelName, String description, List list, long estatistica ) {
        JPanel panel = new JPanel(new GridLayout(0, 1));

        JLabel descriptionLabel = new JLabel(description, SwingConstants.CENTER);
        descriptionLabel.setFont(new Font("Calibri", Font.BOLD, 14));
        descriptionLabel.setBorder(new EmptyBorder(10, 0, 10, 0));
        panel.add(descriptionLabel, BorderLayout.NORTH);

        for (Object obj : list) {
            JLabel infoLabel = new JLabel(obj.toString(), SwingConstants.CENTER);
            infoLabel.setFont(new Font("Calibri", Font.BOLD, 12));
            infoLabel.setBorder(new EmptyBorder(10, 0, 10, 0));
            panel.add(infoLabel);
        }

        JLabel estatiticaLabel = new JLabel("Estatística: " + String.valueOf(estatistica) + " registros", SwingConstants.NORTH_EAST);
        estatiticaLabel.setFont(new Font("Calibri", Font.BOLD, 14));
        //estatiticaLabel.setBorder(new EmptyBorder(2, 0, 2, 0));
        panel.add(estatiticaLabel, BorderLayout.LINE_END);

        JPanel wrappedPanel = wrapWithReproducaoPanel(panel);
        multiplosPaineis.add(panelName, wrappedPanel);
    }

    public JPanel wrapWithReproducaoPanel(JPanel panelToWrap) {
        JPanel wrapperPanel = new JPanel(new BorderLayout());
        JPanel reproducaoPanel = new MenuPanel(app, this);
        wrapperPanel.add(panelToWrap, BorderLayout.CENTER);
        wrapperPanel.add(reproducaoPanel, BorderLayout.SOUTH);
        return wrapperPanel;
    }

    // painel para adicionar novos audios à playlist
    public void addPanelAddToPlaylist(String panelName, List<Audio> list) {
        JPanel panel = new JPanel(new GridLayout(0, 1));
        JButton audioButton;
        for (Audio aud : list) {
            audioButton = new JButton(aud.getTitulo());
            audioButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(app.getPlaylist().adicionaAudio(aud) == true){
                        JOptionPane.showMessageDialog(null, "adicionado à playlist com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "já está na playlist");
                    }
                }
            });
            panel.add(audioButton);
        }

        JPanel wrappedPanel = wrapWithReproducaoPanel(panel);
        multiplosPaineis.add(panelName, wrappedPanel);
    }

}
