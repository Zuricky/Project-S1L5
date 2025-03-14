// classe RegistrazioneAudio estende ElementoMultimediale, variabili durata e volume (int) e un costruttore per assegnare durata e volume
public class RegistrazioneAudio extends ElementoMultimediale {
    private int durata, volume;

    public RegistrazioneAudio(String titolo, int durata, int volume) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
    }

    public void aumentaVolume() {
        volume += 10;
    }

    public void diminuisciVolume() {
        volume -= 10;
    }

    // metodo play() (durata, volume)
    public void play() {
        System.out.println("Durata: " + durata + ", Volume: " + volume);
    }

    @Override
    public void esegui() {

    }
}