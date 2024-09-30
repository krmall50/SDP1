public class RegularMovieFactory extends MovieFactory{
    @Override
    Movie createMovie() {
        return new RegularMovie();
    }
}
