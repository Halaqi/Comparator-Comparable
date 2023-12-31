import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Movie> list = new ArrayList<Movie>();
        list.add(new Movie("Force Awakens", 8.3f, 2015));
        list.add(new Movie("Star Wars", 8.7f, 1977));
        list.add(new Movie("Empire Strikes Back",8.8f, 1980));
        list.add(new Movie("Return of the Jedi", 8.4f, 1983));

        System.out.println("Sorted by rating");
        RatingCompare ratingCompare = new RatingCompare();
        Collections.sort(list,ratingCompare);
        for (Movie movie : list)
            System.out.println("Movie name: " +movie.getName() + " Movie rating: " + movie.getRating() + " Movie produced year: " +movie.getYear());

        System.out.println("\nSorted by name");
        NameCompare nameCompare = new NameCompare();
        Collections.sort(list, nameCompare);
        for (Movie movie : list)
            System.out.println("Movie name: " +movie.getName() + " Movie rating: " + movie.getRating() + " Movie produced year: " +movie.getYear());


        System.out.println("\nsorting by year");
        Collections.sort(list);
        for (Movie movie: list)
            System.out.println("Movie name: " +movie.getName() + " Movie rating: " + movie.getRating() + " Movie produced year: " +movie.getYear());

    }
}
