package part2_hobbyclass;

public class Part2HobbyClass {
    public static void main(String[] args) {
        Game game1 = new Game("Title", "Genre", 1999, 1.0);
        game1.setTitle("Bioshock");
        game1.setGenre("Shooter");
        game1.setReleaseYear(2007);
        game1.setRating(96);
        Game game2 = new Game("Title", "Genre", 1999, 1.0);
        game2.setTitle("Flatout 2");
        game2.setGenre("Racing");
        game2.setReleaseYear(2006);
        game2.setRating(76);
        Game game3 = new Game("Title", "Genre", 1999, 1.0);
        game3.setTitle("Forza Horizon 3");
        game3.setGenre("Racing");
        game3.setReleaseYear(2016);
        game3.setRating(91);
        Game game4 = new Game("Title", "Genre", 1999, 1.0);
        game4.setTitle("Red Dead Redemption 2");
        game4.setGenre("Action");
        game4.setReleaseYear(2018);
        game4.setRating(97);

        game1.printDescription();
        System.out.println("----------------------------------------------------------");
        game2.printDescription();
        System.out.println("----------------------------------------------------------");
        game3.printDescription();
        System.out.println("----------------------------------------------------------");
        game4.printDescription();
    }
}