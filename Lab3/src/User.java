import java.util.ArrayList;

public class User {
    private String username;  private String email;
    private ArrayList<Media> purchased;
    private ArrayList<Media> shoppingcart;


User(String username,String email){
    this.username=username;
    this.email=email;
    this.purchased=new ArrayList<>();
    this.shoppingcart=new ArrayList<>();

}
    public void setUsername(String username){
        this.username=username;
    }
    public String getUsername() {
        return username;
    }
////////////////
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
///////////////
    public void setShoppingcart(ArrayList<Media> shoppingcart) {
        this.shoppingcart = shoppingcart;
    }

    public ArrayList<Media> getShoppingcart() {
        return shoppingcart;
    }
//////////
    public void setPurchased(ArrayList<Media> purchased) {
        this.purchased = purchased;
    }

    public ArrayList<Media> getPurchased() {
        return purchased;

    }


    public void addToCart(Media media){
    shoppingcart.add(media);

    }
    public void removeFromCart(Media media) {
            shoppingcart.remove(media);
    }

    public void checkout() {
    purchased.addAll(shoppingcart);
    shoppingcart.clear();
    }
public void addtopurchased(Media media){
    purchased.add(media);
}



    }


