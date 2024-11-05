import java.util.ArrayList;

public class Movie extends Media {
    private int duration;

    Movie(String title, String auteur, String ISBN, double price,int duration) {
        super(title, auteur, ISBN, price);
        this.duration=duration;
    }


    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }
    //////////////////////////////
    public void watch(User u){
        //watch(User user): Allows users to watch the movie by adding the movie to
        //the purchased list
        u.addtopurchased(this);
    }
    ///
    public ArrayList<Movie> recommendSimilarMovies( ArrayList<Movie> movieCatalog) {
        ArrayList<Movie> recommendedMovies = new ArrayList<>();
        for (Movie m : movieCatalog) {
            if(m.getAuteur().equals(this.getAuteur())){
                recommendedMovies.add(m);
            }
        }
        return recommendedMovies;}

    ///////





    @Override
    public String getMediaType() {
        if(duration >= 120 ){
        return  "Long Movie";}
        return  "Movie";
    }

    @Override
    public String toString() {
        return super.toString() + " duration is : " + duration + " minutes";
    }


    }