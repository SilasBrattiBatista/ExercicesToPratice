package spotify;

public class Audio {
    private String title;
    private double duration;
    private int sumOfReproduction;
    private int likes;
    private String classification;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public int getSumOfReproduction() {
        return sumOfReproduction;
    }

    public void setSumOfReproduction(int sumOfReproduction) {
        this.sumOfReproduction = sumOfReproduction;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public void like() {
        this.likes++;
    }

    public void dislike() {
        this.likes--;
    }

    public void reproduct() {
        this.sumOfReproduction++;
    }
}
