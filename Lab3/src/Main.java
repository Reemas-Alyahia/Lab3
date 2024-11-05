//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //اول شي اسوي ستور عشان ابدا عبي فيه اليوزرز
        Store store = new Store();

        // اسوي يوزرز
        User user1 = new User("Reemas", "Reemas@gmail");
        User user2 = new User("GhaliaQueen", "Queen@email.com");

        // ابدا اضيفهم على كلاس ستور
        store.setUser(user1);
        store.setUser(user2);

        // هنا امشي على كل كلاس من الميديا واختبره

        Movie movie1 = new Movie("The devil wear prade", "Jeems", "654321", 99.99, 148);
        Book book1 = new Book(" Forty Rules of Love book", "Elif Shafak", "123456", 78.99, 8);
        Musiic music1 = new Musiic("As time goes by", "Henry ", "789456", 12.99, "Ed Sheeran");

        //هنا وقت الميديا اجربهم جوا ستور
        store.setMedia(music1);
        store.setMedia(movie1);
        store.setMedia(book1);

        store.getMedia();

        user2.addToCart(book1);
        user2.addToCart(movie1);

        user2.checkout();
        System.out.println("---------------------------------");
        System.out.println(movie1);
        System.out.println(music1);
        System.out.println(book1);
        System.out.println("---------------------------------");
        System.out.println("Purchased by " + user2.getUsername() + ":");
        for (Media media : user2.getPurchased()) {
            System.out.println(media.toString());
        }

    }
}




