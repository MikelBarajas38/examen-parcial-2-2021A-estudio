package uaslp.ingenieria.exams.instruments;

public enum Instrumento {
    PIANO (new Piano()),
    GUITARRA (new Guitarra()),
    FLAUTA (new Flauta()),
    VIOLIN (new Violin());

    private SoundPlayer soundPlayer;

    Instrumento(SoundPlayer soundPlayer) {
        this.soundPlayer = soundPlayer;
    }

    public SoundPlayer getSoundPlayer() {
        return soundPlayer;
    }

}
