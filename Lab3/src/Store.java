import java.util.ArrayList;

public class Store {
    private ArrayList<Media>media;
    private ArrayList<User> user;

Store(){
    this.media=new ArrayList<>();
    this.user=new ArrayList<>();
}
    public void setMedia(Media m) {
        media.add(m);
    }

    public void setUser(User u) {
        user.add(u);
    }

    public void getUser() {
        for (User u:user){
            System.out.println(u.getUsername());
        }
    }

    public void getMedia() {
        for (Media m:media){
            System.out.println(media.toString());
        }
    }

    //searchBook(String title): Searches for a book by title and returns

    public Book searchBook(String title) {
        for (Media m : media) {
            if (m.getTitle().equalsIgnoreCase(title)) {
                return (Book) m;
            }

        }
         return null;
    }
}

