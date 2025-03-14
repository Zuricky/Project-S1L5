import java.util.Scanner;

// classe LettoreMultimediale che comprende ElementoMultimediale[] (accetta 5 elementi), scanner e caricaElementi()
public class LettoreMultimediale {
    private ElementoMultimediale[] elementi;
    private Scanner scanner;

    public LettoreMultimediale() {
        elementi = new ElementoMultimediale[5];
        scanner = new Scanner(System.in);
        caricaElementi();
    }

    public void caricaElementi() {
        elementi[0] = new Immagine("Immagine 1", 50);
        elementi[1] = new Video("Video 1", 50, 50, 60);
        elementi[2] = new Immagine("Immagine 2", 70);
        elementi[3] = new RegistrazioneAudio("Registrazione 1", 80, 60);
        elementi[4] = new Video("Video 2", 60, 60, 80);
    }

    // funzione avvia(), permette di scegliere quale elemento eseguire oppure uscire con "0"
    public void avvia() {
        int scelta = 0;
        do {
            System.out.println("Scegli un elemento da eseguire 1-5 (0 per uscire):");
            scelta = scanner.nextInt();
            if (scelta > 0 && scelta <= 5) {
                elementi[scelta -1].esegui();
            }
        }while (scelta != 0);
        System.out.println("Chiusura del lettore multimediale.");
        }
        }