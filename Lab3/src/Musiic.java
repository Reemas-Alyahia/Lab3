import java.util.ArrayList;

public class Musiic extends Media {
    private String artist;

    Musiic(String title, String auteur, String ISBN, double price,String artist) {
        super(title, auteur, ISBN, price);
        this.artist=artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public void listen(User u) {
        u.addtopurchased(this);
    }
    ////
    public ArrayList<Musiic> generatePlaylist(ArrayList<Musiic> musicCatalog) {
        ArrayList<Musiic> playlist = new ArrayList<>();
        for (Musiic m : musicCatalog) {
            if (m.getAuteur().equals(this.getAuteur())) {
                playlist.add(m);
            }
        }
        return playlist;
    }


    @Override
    public String getMediaType() {
        if(getPrice() >= 10){
        return "Premium Music";}
         return "Music";
    }
    @Override
    public String toString() {
        return super.toString() + "And The Artist: " + artist;
    }



    }

