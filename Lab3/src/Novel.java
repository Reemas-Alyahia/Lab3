public class Novel extends Book{
    private String genre;

    Novel(String title, String auteur, String ISBN, double price, int stock,String genre) {
        super(title, auteur, ISBN, price, stock);
        this.genre=genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }
    @Override
    public String getMediaType(){
if(getAverageRating()>=4.5){
    return "Bestselling Novel"; }
   return "Novel";}



    @Override
    public String toString() {
        return super.toString() + ", Genre: " + genre;
    }

}
