package _05_netflix;

public class NetflixRunner {
public static void main(String[] args) {
	Movie mov1 = new Movie("Scary Movie", 3);
	Movie mov2 = new Movie("Happy Movie", 4);
	Movie mov3 = new Movie("Bad Movie", 1);
	Movie mov4 = new Movie("Good Movie", 5);
	Movie mov5 = new Movie("Cartoon Movie", 3);
	NetflixQueue Net = new NetflixQueue();
	Net.addMovie(mov1);
	Net.addMovie(mov2);
	Net.addMovie(mov3);
	Net.addMovie(mov4);
	Net.addMovie(mov5);
	Net.printMovies();
	Movie a = Net.getBestMovie();
	System.out.println("The best movie is " + a);
	Net.sortMoviesByRating();
	Movie b = Net.getMovie(1);
	System.out.println("The second best movie is " + b);
}
}
