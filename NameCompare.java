import java.util.Comparator;

public class NameCompare implements Comparator<Movie> {
    public int compare(Movie name1, Movie name2)
    {
        return name1.Name.compareTo(name2.Name);
    }
}
