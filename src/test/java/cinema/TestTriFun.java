package cinema;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cinema.data.MovieMoi;
import tool.TriFun;

class TestTriFun {

	@Test
	void test() 
	{
		 TriFun<String,Integer, Integer, MovieMoi> f;
		 f = MovieMoi::new;
		 var m = f.apply("Joker", 2019, 165);
		 System.out.println(m);
		 System.out.println(m.getClass());	 
	}

}
