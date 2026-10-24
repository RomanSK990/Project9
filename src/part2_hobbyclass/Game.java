package part2_hobbyclass;
// Class in a different file
class Game {
    private String title;
    private String genre;
    private int releaseYear;
    private double rating;
    // Constructor
    public Game (String title, String genre, int releaseYear, double rating) {
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.rating = rating;
    }
    // Getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        if (rating <= 100 && rating >= 0) {
            this.rating = rating;
        }
    }
    // Method to perform output of description
    public void printDescription() {
        System.out.println("Title: " + getTitle());
        System.out.println("Genre: " + getGenre());
        System.out.println("ReleaseYear: " + getReleaseYear());
        System.out.println("Rating: " + getRating() + "/100");
    }
}