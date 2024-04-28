import java.util.ArrayList;
import java.util.Scanner;
public class Store {
    Scanner scan = new Scanner(System.in);
    String storeName = "Movies42";
    String[] categories = {"Horror", "Romance", "Scifi"};    // creating array for categories
    ArrayList<Movie> movies = new ArrayList<>();    // creating ArrayList for movies


    // creating method for adding moives to arraylist
    public void createMovie(String category, String name, double price, int quantity, int ageLimit, String release) {
        Movie movie = new Movie(category, name, price, quantity, ageLimit, release);
        //adding movie to movie arraylist
        movies.add(movie);
    }

    public Store() {
        //chooseCategory();

        // creating movies for ArrayList
        createMovie("Romance", "Pride and Prejudice", 99.99, 15, 5, "04/01/2006");
        createMovie("Romance", "Love Actually", 65.7, 17, 15, "14/11/2003");
        createMovie("Romance", "The Notebook", 69.9, 12, 13, "27/08/2004");
        createMovie("Horror", "Lights out", 80.5, 11, 16, "10/08/2016");
        createMovie("Scifi", "Hitchiker's Guide to the Galaxy", 9999.99, 3, 13, "28/04/2005");
        createMovie("Scifi", "Starwars", 25.9, 4, 5, "16/12/1977");

        for (int i = 0; i < movies.size(); i++) {
            System.out.println(movies.get(i));
        }
    }

    // method for choosing category
    public void chooseCategory() {
        System.out.println("Which category would you like to choose? Please enter the respective number.");
        for (int i = 0; i < categories.length; i++) {
            System.out.println((i + 1) + ". " + categories[i]);
        }
        int choice = scan.nextInt();

      /*  if (choice > 1 || choice < 3) {
            switch (choice) {
                case 1 -> chooseMovie(choice);
            }
        }
    }

    public void chooseMovie(int choice) {
        for (int i=0; i<movies.size(); i++) {
            movies.get() = ;
            Movie(category)
        }
    }
    public void itemOutOfStock(String item, int quantity){
    }*/
    }
}
