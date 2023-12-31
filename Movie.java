public class Movie implements Comparable<Movie> {
    String Name;
    float rating;
    int year;
       public Movie(String name,float rating, int year)
       {
           this.Name=name;
           this.rating=rating;
           this.year=year;
       }

    @Override
    public int compareTo(Movie movie){
        return year-movie.year;

    }
    public String getName() {
        return Name;
    }

    public float getRating() {
        return rating;
    }

    public int getYear() {
        return year;
    }
    @Override
    public String toString() {
        return "Movie name: "+getName()+" Movie rating: "+getRating()+" Movie produced year: "+getYear();
    }
}
