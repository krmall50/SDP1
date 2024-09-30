public class StandardSchedule implements MovieSchedule{
    private String Movie;
    private String time;
    public StandardSchedule(String movie, String time){
        this.Movie = movie;
        this.time = time;
    }
    public String getMovie() {
        return Movie;
    }

    public void setMovie(String movie) {
        this.Movie = movie;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    @Override
    public StandardSchedule clone() {
        try {
            return (StandardSchedule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Movie: " + Movie + ", Time: " + time;
    }
}
