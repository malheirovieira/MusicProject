package Classes;

public class Podcast extends Audio {

    private String podcastNome;
    private String tema;
    private String apresentador;



    public String getPodcastNome() {
        return podcastNome;
    }

    public void setPodcastNome(String podcastNome) {
        this.podcastNome = podcastNome;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    @Override
    public void exibeFichaTecnica() {
        System.out.println("Podcast: " + getPodcastNome());
        System.out.println("Apresentador: " + apresentador);
        System.out.println("Tema: " + tema);
        System.out.println("Duração: " + getDuracaoEmMinutos() + " Minutos");
    }
}


