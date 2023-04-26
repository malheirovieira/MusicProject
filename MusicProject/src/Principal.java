import Classes.Musica;
import Classes.Podcast;
public class Principal {
    public static void main(String[] args) {

        System.out.println("\n--------------------------------------------------\n");

        Musica musica = new Musica();

        musica.setCantor("Juice World");
        musica.setNome("734");
        musica.setGeneroMusical("Hip-Hop/rap");
        musica.setDuracaoEmSegundos(260);

        musica.musicaExibeFichaTecnica();

        System.out.println("\n--------------------------------------------------\n");

        Podcast podcast = new Podcast();

        podcast.setPodcastNome("Inteligencia LTDA");
        podcast.setApresentador("Rogerio Vilela");
        podcast.setTema("Iniciante em programação Java");
        podcast.setDuracaoEmMinutos(180);

        podcast.podcastExibeFichaTecnica();

        System.out.println("\n--------------------------------------------------\n");

    }
}