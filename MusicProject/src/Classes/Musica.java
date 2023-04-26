package Classes;

public class Musica extends Audio {

    private String generoMusical;
    private String cantor;



    public String getGeneroMusical() {
        return generoMusical;
    }

    public void setGeneroMusical(String generoMusical) {
        this.generoMusical = generoMusical;
    }

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public void musicaExibeFichaTecnica(){
        System.out.println("Musica: " + getNome());
        System.out.println("Cantor: " + cantor);
        System.out.println("Genero musical: " + getGeneroMusical());
        System.out.println("Duração: " + getDuracaoEmSegundos() + " Segundos");
    }


}
