public class IMAXMovieFactory extends MovieFactory{
    @Override
    Movie createMovie() {
        return new IMAXMovie();
    }
}
