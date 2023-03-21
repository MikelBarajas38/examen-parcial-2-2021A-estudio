package uaslp.ingenieria.exams.instruments;

import uaslp.ingenieria.exams.Nota;

public class Piano implements SoundPlayer {

    public void playNote(Nota nota) {
        presionaTecla(nota);
    }

    public void presionaTecla(Nota nota){

    }
}
