public class TicketBooking {
    private String MovieTitle;
    private String seatNumber;
    private String snackComb;
    private TicketBooking(){};

    public String getMovieTitle() {
        return MovieTitle;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public String getSnackComb() {
        return snackComb;
    }

    @Override
    public String toString() {
        return "TicketBooking: movieTitle=" + MovieTitle +
                ", seatNumber=" + seatNumber +
                ", snackCombo=" + snackComb;
    }

    public static class TicketBookingBuilder{
        private TicketBooking booking;
        public TicketBookingBuilder(){
            this.booking = new TicketBooking();
        }
        public TicketBookingBuilder setMovieTitle(String title){
            this.booking.MovieTitle = title;
            return this;
        }
        public TicketBookingBuilder setSeatNumber(String seatNumber){
            this.booking.seatNumber = seatNumber;
            return this;
        }
        public TicketBookingBuilder setSnackComb(String snackComb){
            this.booking.snackComb = snackComb;
            return this;
        }
        public TicketBooking build(){
            return this.booking;
        }
    }
}
