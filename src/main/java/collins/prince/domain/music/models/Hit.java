package collins.prince.domain.music.models;

public class Hit {
    private Track track;

    public Track getTrack() {
        return track;
    }

    public void setTrack(Track track) {
        this.track = track;
    }

    @Override
    public String toString() {
        return "Hit{" +
                "track=" + track +
                '}';
    }
}
