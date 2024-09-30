public class ThreeDMovieFactory extends MovieFactory{
    @Override
    Movie createMovie() {
        return new ThreeDMovie();
    }
}
