package test.cinema.data;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;

import cinema.data.MovieMoi;
import cinema.data.PersonMoi;


class TestMovieMoi {
	
	@Test
	void test() {
		
		
		MovieMoi movie = new MovieMoi("Joker", 2019, 165);
		MovieMoi movie2 = new MovieMoi("Parasite", 2019, 132);
		
		
		List<MovieMoi> movies = List.of(movie, movie2);
		
		System.out.println(movie);
		System.out.println(movie2);
		
		System.out.println("Movies: " + movies);
		
		MovieMoi oneMovie = movies.get(0);
		System.out.println("Movie tonight: " + oneMovie);
			
	}

	
	
	@Test
	void testEquals1()
	{
		MovieMoi movieJ = new MovieMoi("Joker", 2019, 165);
		MovieMoi movieP = new MovieMoi("Parasite", 2019, 132);
		MovieMoi movie = movieJ;
		
		System.out.println(movieJ == movieP);
		System.out.println(movieJ == movieJ);
		System.out.println(movie == movieJ);
	}
	
	
	@Test
	void testEquals2()
	{
		MovieMoi movieChaosI = new MovieMoi("Chaos", 2005, 0);
		MovieMoi movieChaosII = new MovieMoi("Chaos", 2005, 0);
		System.out.println(movieChaosI == movieChaosII);
	}
	

	@Test 
	void testMovieAsObject()
	{
		MovieMoi movieChaosI = new MovieMoi("Chaos", 2005, 0);
		Object obj = movieChaosI;
		MovieMoi movie = (MovieMoi) obj;
		System.out.println(movie.getTitre());
		
		//add directors
	    PersonMoi tp = new PersonMoi("Todd Phililips");
		movie.setDirector(tp);;
		System.out.println(movie + "réalisé par " + movie.getDirector());
		System.out.println(movie.getTitre() + " réalisé par "
						+ movie.getDirector().getName());
		//Clint EastWood
		PersonMoi clint = new PersonMoi("Clint Eastwood", LocalDate.of(1930, 5, 31));
		System.out.println(clint + " a " + clint.getAge().getAsInt() + " ans ");
		MovieMoi movieGT = new MovieMoi("Gran Torino", 1992, 116, clint);
		MovieMoi movieI = new MovieMoi("Impitoyable", 1992, clint);
		
	}
	

	@Test
	void testEquals() {
		MovieMoi movieChaosI = new MovieMoi("Chaos", 2005);
		MovieMoi movieChaosII = new MovieMoi("Chaos", 2005);
		System.out.println(movieChaosI == movieChaosII);         // retourne false parceque ce ne sont pas les mêmes objets 
		System.out.println(movieChaosI.equals(movieChaosII));    // retourne true parceque contient les mêmes données 
	}
	
	
	
	
	
	
	
	
}
