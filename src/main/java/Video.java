// classe Video estende ElementoMultimediale, variabili luminosità, volume e durata (int) e un costruttore per assegnare luminosità, volume e durata
public class Video extends ElementoMultimediale {
    private int luminosita;
    private int volume;
    private int durata;

    public Video(String titolo, int luminosita, int volume, int durata) {
        super(titolo);
        this.luminosita = luminosita;
        this.volume = volume;
        this.durata = durata;
    }

    public void aumentaLuminosita() {
        luminosita += 10;
    }

    public void diminuisciLuminosita() {
        luminosita -= 10;
    }

    public void aumentaVolume() {
        volume += 10;
    }

    public void diminuisciVolume() {
        volume -= 10;
    }

    public void play() {
        System.out.println("Durata: " + durata + ", Volume: " + volume + ", Luminosità: " + luminosita);
    }

    @Override
    public void esegui() {
        play();
    }
}