import javax.swing.*;
import java.awt.*;

public class ReproducaoPanel extends JPanel {
    private Aplicacao app;

    public ReproducaoPanel() {
        setLayout(new BorderLayout());
        setBackground(Color.BLACK);

        JPanel botoesPanel = createBotoesPanel();
        JProgressBar progressBar = createProgressBar();

        add(botoesPanel, BorderLayout.NORTH);
        add(progressBar, BorderLayout.CENTER);
    }

    private JPanel createBotoesPanel() {
        JPanel botoesPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel playingNow = new JLabel();
        JButton previousButton = createButton("Anterior");
        JButton playButton = createButton("Play");
        JButton pauseButton = createButton("Pause");
        JButton nextButton = createButton("Próximo");
        botoesPanel.add(previousButton);
        botoesPanel.add(playButton);
        botoesPanel.add(pauseButton);
        botoesPanel.add(nextButton);
        return botoesPanel;
    }

    private JButton createButton(String label) {
        JButton button = new JButton(label);
        // ainda a fazer lógica de cada botão
        return button;
    }

    private JProgressBar createProgressBar() {
        JProgressBar progressBar = new JProgressBar();
        progressBar.setValue(10); // Defina um valor para representar o progresso
        progressBar.setPreferredSize(new Dimension(400, 15));
        // Lógica necessária para a barra de progresso...
        return progressBar;
    }
}