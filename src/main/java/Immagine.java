// classe Immagine che estende ElementoMultimediale, variabile luminosità (int) e un costruttore per assegnare luminosità
public class Immagine extends ElementoMultimediale {
    private int luminosita;

    public Immagine(String titolo, int luminosita) {
        super(titolo);
        this.luminosita = luminosita;
    }

    public void aumentaLuminosita() {
        luminosita += 10;
    }

    public void diminuisciLuminosita() {
        luminosita -= 10;
    }

    // show() (luminosità)
    public void show() {
        System.out.println("Luminosità: " + luminosita);
    }

    // implementa esegui() richiamando show(), utilizza lombok
    @Override
    public void esegui() {
        show();
    }
}