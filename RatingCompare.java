import java.util.Comparator;

public class RatingCompare implements Comparator<Movie> {

    @Override
    public int compare(Movie rating1, Movie rating2) {
       return Float.compare(rating1.rating,rating2.rating);
    }
}
