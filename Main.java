import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Artista artista1 = new Artista("A001", "John Legend", "Soulful singer and songwriter");
        Artista artista2 = new Artista("A002", "Adele", "Powerhouse vocalist with a soulful touch");
        Artista artista3 = new Artista("A003", "Ed Sheeran", "Singer-songwriter known for heartfelt lyrics");

        Album album1 = new Album(artista1, "ALB001", "Love in the Darkness", "2022-01-01");
        Musica musica1 = new Musica("M001", "All of Me", 4.5, "Some lyrics...");
        Musica musica2 = new Musica("M002", "Ordinary People", 5.2, "Some lyrics...");
        Musica musica3 = new Musica("M003", "Save Room", 4.0, "Some lyrics...");
        album1.addMusica(musica1);
        album1.addMusica(musica2);
        album1.addMusica(musica3);

        Album album2 = new Album(artista2, "ALB002", "Rolling in the Deep", "2022-02-01");
        Musica musica4 = new Musica("M004", "Rolling in the Deep", 3.8, "Some lyrics...");
        Musica musica5 = new Musica("M005", "Someone Like You", 4.5, "Some lyrics...");
        Musica musica6 = new Musica("M006", "Set Fire to the Rain", 3.8, "Some lyrics...");
        album2.addMusica(musica4);
        album2.addMusica(musica5);
        album2.addMusica(musica6);

        Album album3 = new Album(artista3, "ALB003", "Shape of You", "2022-03-01");
        Musica musica7 = new Musica("M007", "Shape of You", 3.2, "Some lyrics...");
        Musica musica8 = new Musica("M008", "Castle on the Hill", 4.2, "Some lyrics...");
        Musica musica9 = new Musica("M009", "Galway Girl", 3.5, "Some lyrics...");
        album3.addMusica(musica7);
        album3.addMusica(musica8);
        album3.addMusica(musica9);

        Podcast podcast1 = new Podcast("P001", "Funny Talks", Podcast.Categoria.COMEDIA, "Podcast de comédia");
        Episodio episodio1Podcast1 = new Episodio("E001", "Laugh Out Loud", 30.5, "John Doe", "Episodio engraçado", "Transcrição do episódio engraçado", "2022-01-01");
        Episodio episodio2Podcast1 = new Episodio("E002", "Jokes Galore", 25.0, "Jane Smith", "Mais piadas", "Transcrição do episódio de piadas", "2022-02-01");
        Episodio episodio3Podcast1 = new Episodio("E003", "Comedy Special", 35.2, "Bob Johnson", "Especial de comédia", "Transcrição do episódio especial de comédia", "2022-03-01");
        podcast1.lançaEpisiodio(episodio1Podcast1);
        podcast1.lançaEpisiodio(episodio2Podcast1);
        podcast1.lançaEpisiodio(episodio3Podcast1);

        Podcast podcast2 = new Podcast("P002", "Daily Insights", Podcast.Categoria.DIA_A_DIA, "Podcast sobre acontecimentos diários");
        Episodio episodio1Podcast2 = new Episodio("E004", "Daily News Recap", 20.0, "Sarah Johnson", "Resumo de notícias diárias", "Transcrição do episódio de resumo de notícias", "2022-01-02");
        Episodio episodio2Podcast2 = new Episodio("E005", "Life Hacks", 15.8, "Michael Brown", "Dicas para o dia a dia", "Transcrição do episódio de dicas", "2022-02-02");
        Episodio episodio3Podcast2 = new Episodio("E006", "Guest Interview", 40.0, "Emily White", "Entrevista especial", "Transcrição do episódio de entrevista", "2022-03-02");
        podcast2.lançaEpisiodio(episodio1Podcast2);
        podcast2.lançaEpisiodio(episodio2Podcast2);
        podcast2.lançaEpisiodio(episodio3Podcast2);

        Podcast podcast3 = new Podcast("P003", "Horror Stories", Podcast.Categoria.HORROR, "Podcast de histórias de terror");
        Episodio episodio1Podcast3 = new Episodio("E007", "Haunted Places", 28.3, "Olivia Black", "Lugares assombrados", "Transcrição do episódio sobre lugares assombrados", "2022-01-03");
        Episodio episodio2Podcast3 = new Episodio("E008", "Creepy Tales", 22.5, "David Green", "Contos assustadores", "Transcrição do episódio de contos assustadores", "2022-02-03");
        Episodio episodio3Podcast3 = new Episodio("E009", "Ghosts and Legends", 32.0, "Emma Davis", "Fantasmas e lendas", "Transcrição do episódio sobre fantasmas e lendas", "2022-03-03");
        podcast3.lançaEpisiodio(episodio1Podcast3);
        podcast3.lançaEpisiodio(episodio2Podcast3);
        podcast3.lançaEpisiodio(episodio3Podcast3);

        Playlist playlist = new Playlist("Mixed Playlist");
        playlist.adicionaAudio(musica1);
        playlist.adicionaAudio(episodio1Podcast1);
        playlist.adicionaAudio(musica2);
        playlist.adicionaAudio(episodio2Podcast2);
        playlist.adicionaAudio(musica3);
        playlist.adicionaAudio(episodio3Podcast3);


        // cria uma instancia de JFrame que vai ser usada tanto em MultiplosPaineis
        JFrame frame = new JFrame("Spotify");
        MultiplosPaineis multiplosPaineis = new MultiplosPaineis();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(multiplosPaineis);
        frame.setSize(600, 400);
        frame.setVisible(true);
    }
}
