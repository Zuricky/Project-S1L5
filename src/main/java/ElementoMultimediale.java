// classe astratta ElementoMultimediale con titolo (string) e un costruttore per assegnare il titolo
public abstract class ElementoMultimediale {
    protected String titolo;

    public ElementoMultimediale(String titolo) {
        this.titolo = titolo;
    }

    // metodo astratto esegui() (da implementare nelle sottoclassi)
    public abstract void esegui();
}