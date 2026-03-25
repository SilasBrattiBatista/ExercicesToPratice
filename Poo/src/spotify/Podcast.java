package spotify;

public class Podcast extends Audio{
    private int numberOfParticipants;
    private boolean newComer;

    public Podcast(int numberOfParticipants, boolean newComer){
        this.numberOfParticipants = numberOfParticipants;
        this.newComer = newComer;
    }

    public Podcast() {}

    public int getNumberOfParticipants() {
        return numberOfParticipants;
    }

    public void setNumberOfParticipants(int numberOfParticipants) {
        this.numberOfParticipants = numberOfParticipants;
    }

    public void isNewComer() {
        this.newComer = true;
    }
}
