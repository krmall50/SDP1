public class CinemaConfig {

    private static CinemaConfig instance;
    private String cinemaName;
    private int numberOfScreens;
    private CinemaConfig() {}

    public static synchronized CinemaConfig getInstance() {
        if (instance == null) {
            instance = new CinemaConfig();
        }
        return instance;
    }

    public String getCinemaName() {
        return cinemaName;
    }

    public int getNumberOfScreens() {
        return numberOfScreens;
    }

    public void setCinemaName(String cinemaName) {
        this.cinemaName = cinemaName;
    }

    public void setNumberOfScreens(int numberOfScreens) {
        this.numberOfScreens = numberOfScreens;
    }
}
